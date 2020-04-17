package com.javacourses.homework.threads;

public class HomeThread{
    public static void main(String[] args) {
        Thread thread = new Thread();
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        try {
            Thread.sleep(100);
            System.out.println(thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getState());
        Thread thread1 = new Thread();
        sayName(thread);
        sayName(thread1);
    }
    private synchronized static void sayName(Thread thread){
        System.out.println("Me name is " + thread.getName());
    }
}
