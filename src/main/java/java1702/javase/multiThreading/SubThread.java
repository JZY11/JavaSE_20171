package java1702.javase.multiThreading;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/8.
 * JavaSE_20171.
 */
public class SubThread extends Thread {
    public static void main(String[] args) {
        SubThread subThread = new SubThread();
        subThread.start();
        System.out.println("test....");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
