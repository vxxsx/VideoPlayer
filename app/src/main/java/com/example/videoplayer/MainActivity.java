package com.example.videoplayer;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Message;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import cn.jzvd.JZUtils;
import cn.jzvd.JzvdStd;

public class MainActivity extends AppCompatActivity {
    ListView mainLv;
    String url = "http://47.110.236.37:8383/data";
    List<VideoBean1.DataBean.ArchivesBean> mDatas;
    private VideoAdapter adapter;
    private JzvdStd currentJzvd; // 保存当前播放的 JzvdStd 对象

    @SuppressLint("HandlerLeak")
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 1) {//判断消息的标识符（what字段），如果标识符为1，则执行下面的代码块。
                String json = (String) msg.obj;//从消息中获取携带的数据对象，并将其转换为String类型的json变量
//                解析数据
                Log.d("MainActivity", "json is: " + json);
                VideoBean1 videoBean1 = new Gson().fromJson(json, VideoBean1.class);
                Log.d("MainActivity", "videoBean1 is: " + videoBean1);
//                过滤了不需要的数据

// 检查 videoBean1 和 videoBean1.getData() 是否为 null
                if (videoBean1 != null && videoBean1.getData() != null) {
                    List<VideoBean1.DataBean.ArchivesBean> archivesList = videoBean1.getData().getArchives();

                    // 检查 archivesList 是否为 null
                    if (archivesList != null) {
                        for (int i = 0; i < archivesList.size(); i++) {
                            VideoBean1.DataBean.ArchivesBean archivesBean = archivesList.get(i);
                            mDatas.add(archivesBean);
                        }
                    }
                }

                adapter.notifyDataSetChanged();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("开眼视频");
        mainLv = findViewById(R.id.main_lv);
//        数据源
        mDatas = new ArrayList<>();
//        创建适配器对象
        adapter = new VideoAdapter(this, mDatas);
//        设置适配器
        mainLv.setAdapter(adapter);

//        加载网络数据
        loadData();
    }

    private void loadData() {
        /* 创建新的线程，完成数据的获取*/
        new Thread(new Runnable() {
            @Override
            public void run() {
                String jsonContent = HttpUtils.getJsonContent(url);//通过HTTP请求获取JSON数据，并将结果赋值给jsonContent变量。

//                子线程不能更新UI，需要通过handler发送数据回到主线程
                Message message = new Message();   //发送的消息对象
                message.what = 1;
                message.obj = jsonContent;
                handler.sendMessage(message);
            }
        }).start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        JzvdStd.releaseAllVideos();    //释放正在被播放的视频信息
    }
}

