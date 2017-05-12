package java1702.javase.multiThreading;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/12.
 * JavaSE_20171.
 */
/*
    wait()，join(),sleep()方法需要处理异常而yield()方法不需要，wait()调用时要放在同步声明的方法
    或者同步块中，否则报未受检异常：IllegalMonitorStateException   wait()方法，线程会进入阻塞状态
    丢弃线程锁，其他线程分得时间片后即可进入，需要被通知notify()来解除阻塞状态(不是马上解除阻塞)，但此线程需要执行完
    被阻塞的线程才可继续执行， notifyAll()将全部的阻塞状态解除，但也不是立即解除，需要该线程执行完
    被解除阻塞状态的线程来竞争线程锁
    sleep()方法可以自醒，而wait()必须要有通知notify()或notifyAll()才可醒来
 */
class Sync {
    synchronized void waitTest() {
        System.out.println(Thread.currentThread().getName() + " wait start...");
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " wait end...");
    }

    synchronized void notifyTest() {
        System.out.println(Thread.currentThread().getName() + " notify start...");
        this.notify();//this.notifyAll()
        System.out.println(Thread.currentThread().getName() + " notify end...");
    }
}
class SyncTest implements Runnable{
    private static Sync sync = new Sync();

    @Override
    public void run() {
        if (Thread.currentThread().getName().endsWith("9")) {
            sync.notifyTest();
            return;
        }
        sync.waitTest();
    }

    public static void main(String[] args) {
        SyncTest syncTest = new SyncTest();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(syncTest,"thread" + i);
            thread.start();
        }
    }
}
