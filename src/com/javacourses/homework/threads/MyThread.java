package com.javacourses.homework.threads;

import java.util.Random;

public class MyThread extends Thread {
    Random random = new Random();
    int i = random.nextInt(5001);
    @Override
    public void run(){
        try {
            Thread.sleep(i);
            System.out.println(Thread.currentThread().getName());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
