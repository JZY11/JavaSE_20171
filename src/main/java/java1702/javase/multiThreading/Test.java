package java1702.javase.multiThreading;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/8.
 * JavaSE_20171.
 */
/*
     创建线程有两种方法：(1):类实现一个借口 (2):类拓展Thread父类
     java虚拟机JVM自动调用run()方法
     CPU有时间片(time slipe)概念，在一个时间片只能做一件事情，并不是多个线程同时进行的
     操作进程将CPU的时间片分给每个进程，错误的给人并行处理的感觉
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
