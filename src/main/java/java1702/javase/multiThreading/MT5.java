package java1702.javase.multiThreading;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/8.
 * JavaSE_20171.
 */
public class MT5 implements Runnable{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MT5());
        thread1.setName("thread1");
        Thread thread2 = new Thread(new MT5());
        thread2.setName("thread2");
        Thread thread3 = new Thread(new MT5());
        thread3.setName("thread3");
        thread1.start();
        thread2.start();


        try {
            thread2.join();// 主线程被阻塞(blocked),   thread3和主线程暂时不执行，只能等到thread2执行完了才可执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        thread3.start();//thread3线程被唤醒
        System.out.println("test...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "is running");//获取当前正在执行的线程, Thread类的静态方法currentThread()
            try {
                Thread.sleep(1000 * 1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
