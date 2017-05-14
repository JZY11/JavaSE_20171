package java1702.javase._5_13;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/13.
 * JavaSE_20171.
 */
/*
    3.使用 sleep 方法实现一次阻塞
 */
public class Test3 implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new Test3(),"thread");
        thread.start();
        try {
            thread.sleep(1000 * 3);
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
