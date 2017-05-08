package java1702.javase.multiThreading;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/8.
 * JavaSE_20171.
 */
/*
    Thread类的join()方法，先运行thread的新启动的(start() )的一个线程，运行完后再加入主线程
 */
public class JoinTest implements Runnable{
    public static void main(String[] args) {
        Thread thread = new Thread(new JoinTest());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
