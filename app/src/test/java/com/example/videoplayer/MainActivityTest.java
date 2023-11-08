package com.example.videoplayer;

import static org.junit.Assert.*;

import android.os.Message;

import com.google.gson.Gson;

import org.junit.Test;

import java.util.List;

public class MainActivityTest {

    @Test
    public void test() {
        String url = "http://localhost:8080/data";
        String jsonContent = HttpUtils.getJsonContent(url);//通过HTTP请求获取JSON数据，并将结果赋值给jsonContent变量。
        Message message = new Message();   //发送的消息对象
        message.what = 1;
        message.obj = jsonContent;
        String json = (String) message.obj;
        VideoBean1 videoBean1 = new Gson().fromJson(json, VideoBean1.class);
        System.out.println(videoBean1.getTtl());
        List<VideoBean1.DataBean.ArchivesBean> archivesList = videoBean1.getData().getArchives();//从VideoBean对象中获取视频列表的数据。
        for (VideoBean1.DataBean.ArchivesBean archivesBean:archivesList){
            System.out.println(archivesBean.getBvid());
        }
        System.out.println(message.obj);
    }
}