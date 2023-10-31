package com.example.videoplayer;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import cn.jzvd.JzvdStd;

public class VideoAdapter extends BaseAdapter{
    Context context;
    List<VideoBean.ItemListBean> mDatas;

    public VideoAdapter(Context context, List<VideoBean.ItemListBean> mDatas) {
        this.context = context;
        this.mDatas = mDatas;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_mainlv,parent,false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
//        获取指定位置的数据源
        VideoBean.ItemListBean.DataBean dataBean = mDatas.get(position).getData();
//        设置发布者的信息
        VideoBean.ItemListBean.DataBean.AuthorBean author = dataBean.getAuthor();
        holder.nameTv.setText(author.getName());
        holder.descTv.setText(author.getDescription());
        String iconURL = author.getIcon();
        if (!TextUtils.isEmpty(iconURL)) {
            Picasso.with(context).load(iconURL).into(holder.iconIv);
        }
//     获取点赞数和评论数
        VideoBean.ItemListBean.DataBean.ConsumptionBean consumpBean = dataBean.getConsumption();
        holder.heartTv.setText(consumpBean.getRealCollectionCount()+"");
        holder.replyTv.setText(consumpBean.getReplyCount()+"");
//      设置视频播放器的信息
        holder.jzvdStd.setUp(dataBean.getPlayUrl(),dataBean.getTitle(),JzvdStd.SCREEN_NORMAL);
        String thumbUrl = dataBean.getCover().getFeed();  //缩略图的网络地址
        Picasso.with(context).load(thumbUrl).into(holder.jzvdStd.thumbImageView);
        holder.jzvdStd.positionInList = position;
        return convertView;
    }

    class ViewHolder{
        JzvdStd jzvdStd;//播放
        ImageView iconIv;
        TextView nameTv,descTv,heartTv,replyTv;
        pubilc ViewHolder(View view){
            jzvdStd = view.findViewById(R.id.item_main_jzvd);
            iconIv = view.findViewById(R.id.item_main_iv);
            nameTv = view.findViewById(R.id.item_main_tv_name);
            descTv = view.findViewById(R.id.item_main_tv_des);
            heartTv = view.findViewById(R.id.item_main_iv_heart);
            replyTv= view.findViewById(R.id.item_main_iv_reply);
        }
    }
}


