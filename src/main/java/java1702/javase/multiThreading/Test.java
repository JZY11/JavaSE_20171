package java1702.javase.multiThreading;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/8.
 * JavaSE_20171.
 */
/*
     java虚拟机JVM自动调用run()方法
     CPU有时间片(time slipe)概念，在一个时间片只能做一件事情，并不是多个线程同时进行的
 */
public class Test implements Runnable {
    public static void main(String[] args) {
        Test test = new Test();
        Thread thread = new Thread(test);
        thread.start();// 新开一个线程
        System.out.println("test...");
    }

    @Override
    public void run() {

    }
}
