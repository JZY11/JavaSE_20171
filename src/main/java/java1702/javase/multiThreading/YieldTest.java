package java1702.javase.multiThreading;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/9.
 * JavaSE_20171.
 */
/*
        yield让步，让步的为CPU时间片(time slice)给其他线程，具体让给谁不一定，也有可能调度器再度调度自己，重新分配给自己
        并没有进入阻塞状态，只是重新回到了ready状态
 */
public class YieldTest implements Runnable{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new YieldTest(),"thread1");
        Thread thread2 = new Thread(new YieldTest(), "thread2");
        thread1.start();
        thread2.start();

        System.out.println("test...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ":" + Thread.currentThread().getName()  + "is running...");
            if (i % 10 == 0) {
                Thread.yield();
            }
        }
    }
}
