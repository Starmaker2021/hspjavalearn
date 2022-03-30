package com.weileanan.Interface_.computer;

public class Camera implements AInterface{
    @Override
    public void start() {
        System.out.println("camera is working!");
    }

    @Override
    public void stop() {
        System.out.println("camera is not working");
    }
}
