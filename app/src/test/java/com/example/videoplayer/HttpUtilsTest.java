package com.example.videoplayer;

import static org.junit.Assert.*;

import org.junit.Test;

public class HttpUtilsTest {

    @Test
    public void getJsonContent() {
        String url = "http://localhost:8080/data";
//        HttpUtils.getJsonContent(url);
        System.out.println(HttpUtils.getJsonContent(url));

    }
}