package java1702.javase._5_13;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/13.
 * JavaSE_20171.
 */
/*
    2. 使用 Runnable 接口实现多线程
 */
public class Test2 implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new Test2(), "thread");
        thread.start();
    }



    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
    }
}
