package java1702.javase._5_13;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/13.
 * JavaSE_20171.
 */
/*
   5. 使用 wait 方法实现一次阻塞
 */
public class Test5 implements Runnable {
    public static void main(String[] args) {
        Test5 test5 = new Test5();
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(test5, "thread" + i);
            thread.start();
        }
    }
    private static T5 t5 = new T5();

    @Override
    public void run() {
        if (Thread.currentThread().getName().endsWith("2")) {
            t5.wait1();
        }
    }
}
class T5{
    synchronized void wait1(){
        System.out.println(Thread.currentThread().getName() + " start wait...");
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " end wait...");
    }
}
