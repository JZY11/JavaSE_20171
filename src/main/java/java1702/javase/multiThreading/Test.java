package java1702.javase.multiThreading;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/8.
 * JavaSE_20171.
 */
/*
     多线程比单线程的优势：可充分利用好CPU
     创建线程有两种方法：(1):类实现一个借口(Runnable) (2):类拓展Thread父类
     java虚拟机JVM自动调用run()方法是接口(AutoRunnable)的抽象方法
     CPU有时间片(time slice)概念，在一个时间片只能做一件事情，并不是多个线程同时进行的
     操作进程将CPU的时间片分给每个进程，错误的给人并行处理的感觉
 */
public class Test implements Runnable {
    public static void main(String[] args) {
        //进程 process ：一个软件的运行，比较独立
        //线程 thread  进程内部的一个单独执行的过程
        Test test = new Test();//创建当前类的实例
        Thread thread = new Thread(test);// 创建thread类的实例  传入Runnable实例类的对象
                                        //   接口和抽象类都不能实例化
        thread.start();// 新开一个线程
        System.out.println("test...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
