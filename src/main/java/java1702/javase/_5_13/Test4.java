package java1702.javase._5_13;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/13.
 * JavaSE_20171.
 */
/*
   4.使用 join 方法实现一次阻塞
 */
public class Test4 implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new Test4(),"thread");
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
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
    }
}
