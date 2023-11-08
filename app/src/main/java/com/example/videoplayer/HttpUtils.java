package com.example.videoplayer;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpUtils {

    public static String getJsonContent(String path){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();//创建一个ByteArrayOutputStream对象，用于存储从输入流中读取的数据。
        try {
            URL url = new URL(path);//根据传入的URL路径创建一个URL对象

            //通过URL对象的openConnection方法创建一个HttpURLConnection对象，用于建立与服务器的连接。
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.connect();//建立与服务器的连接。
            InputStream is = conn.getInputStream();//获取与服务器连接的输入流，用于读取服务器响应的数据。
            byte[]buf = new byte[1024];//创建一个字节数组缓冲区，用于存储从输入流中读取的数据。
            int hasRead = 0;//定义一个整型变量hasRead，用于记录从输入流中读取的字节数。
            while ((hasRead = is.read(buf))!=-1){
                baos.write(buf,0,hasRead);//循环读取输入流中的数据，直到读取到末尾（返回值为-1）。
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baos.toString();
    }
}
