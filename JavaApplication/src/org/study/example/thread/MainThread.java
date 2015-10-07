package org.study.example.thread;

public class MainThread {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(myThread.isAlive());

    }
}
