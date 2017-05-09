package java1702.javase.multiThreading;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/9.
 * JavaSE_20171.
 */
/*
     Priority 优先级  范围[1,10]
              MIN_PRIORITY 1
              MAX_PRIORITY 10
              NORMAL_PRIORITY 5
 */
public class ThreadPriorityTest implements Runnable{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadPriorityTest(),"thread1");
        Thread thread2 = new Thread(new ThreadPriorityTest(),"thread2");
//        Thread thread3 = new Thread(new ThreadPriorityTest(), "thread3");
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
//        thread3.setPriority(thread3.NORMAL_PRIORITY);
        thread1.start();
        thread2.start();
//        thread3.start();
    }

    @Override
    public void run() {
        System.out.println("running thread:" + Thread.currentThread().getName());
        System.out.println("running priority:" + Thread.currentThread().getPriority());
    }
}
