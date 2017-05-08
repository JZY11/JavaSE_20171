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
    }

    @Override
    public void run() {
        super.run();
    }
}
