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
    List<VideoBean1.DataBean.ArchivesBean> mDatas;//用于保存视频列表的数据。

    public VideoAdapter(Context context, List<VideoBean1.DataBean.ArchivesBean> mDatas) {
        this.context = context;
        this.mDatas = mDatas;

    }

    /**
     *
     * @return 视频列表数据的数量。
     */
    @Override
    public int getCount() {
        return mDatas.size();
    }

    /**
     *
     * @param position 我们想要其数据的项在适配器中的位置
     * data set.
     * @return 返回指定位置的视频列表数据项
     */
    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    /**
     *
     * @param position   我们想要其行id的适配器数据集中的项的位置。
     * @return 返回指定位置的视频列表数据项的ID
     */
    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     *
     * @param position 项在其视图的项的适配器数据集中的位置
     *        we want.
     * @param convertView The old view to reuse, if possible. Note: You should check that this view
     *        is non-null and of an appropriate type before using. If it is not possible to convert
     *        this view to display the correct data, this method can create a new view.
     *        Heterogeneous lists can specify their number of view types, so that this View is
     *        always of the right type (see {@link #getViewTypeCount()} and
     *        {@link #getItemViewType(int)}).
     * @param parent The parent that this view will eventually be attached to
     * @return
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {//如果为空则表示当前位置没有可复用的视图，需要创建一个新的视图。

            //使用LayoutInflater从布局文件R.layout.item_mainlv中创建一个新的视图，并将其赋值给convertView。
            convertView = LayoutInflater.from(context).inflate(R.layout.item_mainlv,parent,false);
            //创建一个新的ViewHolder对象，并将其与convertView关联。
            holder = new ViewHolder(convertView);
            //将ViewHolder对象保存到convertView的Tag中，以便在后续的getView调用中进行复用。
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
//        获取指定位置的数据源
        VideoBean1.DataBean.ArchivesBean archivesBean = mDatas.get(position);
//        设置发布者的信息
        VideoBean1.DataBean.ArchivesBean.OwnerBean owner = archivesBean.getOwner();
        holder.nameTv.setText(owner.getName());
        String faceURL = owner.getFace();

        if (!TextUtils.isEmpty(faceURL)) {
            //检查头像URL是否为空，如果不为空则使用Picasso库加载头像图片，并将其显示在对应的ImageView中。
            Picasso.with(context).load(faceURL).into(holder.iconIv);
        }
//     获取视频描述，点赞数和评论数
        holder.descTv.setText(archivesBean.getDesc());

        VideoBean1.DataBean.ArchivesBean.StatBean statBean = archivesBean.getStat();
        holder.heartTv.setText(statBean.getLike()+"");
        holder.replyTv.setText(statBean.getDanmaku()+"");

//      设置视频播放器的信息，包括视频的播放URL和标题。
        String url = "http://47.110.236.37:8383/video?bvid="+archivesBean.getBvid();
        holder.jzvdStd.setUp(url,archivesBean.getTitle(),JzvdStd.SCREEN_NORMAL);
        String thumbUrl = archivesBean.getPic();  //缩略图的网络地址
        //使用Picasso库加载缩略图图片，并将其显示在视频播放器的海报ImageView中。
        Picasso.with(context).load(thumbUrl).into(holder.jzvdStd.posterImageView);
        //将当前列表项的位置保存到视频播放器的positionInList属性中，以便在点击事件中获取到正确的位置。
        holder.jzvdStd.positionInList = position;
        return convertView;//返回设置好数据的视图，用于显示在列表中。
    }

    class ViewHolder{
        JzvdStd jzvdStd;
        ImageView iconIv;
        TextView nameTv,descTv,heartTv,replyTv;
        public ViewHolder(View view){
            jzvdStd = view.findViewById(R.id.item_main_jzvd);
            iconIv = view.findViewById(R.id.item_main_iv);
            nameTv = view.findViewById(R.id.item_main_tv_name);
            descTv = view.findViewById(R.id.item_main_tv_des);
            heartTv = view.findViewById(R.id.item_main_iv_heart);
            replyTv = view.findViewById(R.id.item_main_iv_reply);
        }
    }
}
