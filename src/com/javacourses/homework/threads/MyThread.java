package com.javacourses.homework.threads;

import java.util.Random;

public class MyThread extends Thread {
    private Random random = new Random();
    @Override
    public void run(){
        try {
            int i = 1000;
            Thread.sleep(i);
            System.out.println(Thread.currentThread().getName());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
