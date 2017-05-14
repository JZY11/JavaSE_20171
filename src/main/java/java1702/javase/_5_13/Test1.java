package java1702.javase._5_13;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/13.
 * JavaSE_20171.
 */
/*
   1. 使用 Thread 类实现多线程
 */
public class Test1 extends Thread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Test1(), "thread");
        thread.start();
    }
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
    }
}
