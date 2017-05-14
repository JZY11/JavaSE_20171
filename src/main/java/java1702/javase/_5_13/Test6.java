package java1702.javase._5_13;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/13.
 * JavaSE_20171.
 */
/*
   6. 编写一个程序，子线程循环 10 次，接着主线程循环 100 次，接着又回到子线程循环 10 次，
   接着再回到主线程又循环 100 次，如此循环50次
 */
public class Test6 implements Runnable {
    private static final int ROUND_COUNT = 50;
    private static T6 t6 = new T6();

    public static void main(String[] args) {
        Thread thread = new Thread(new Test6(), "thread");
        thread.start();

        for (int i = 0; i < ROUND_COUNT; i++) {
            t6.main(i);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < ROUND_COUNT; i++) {
            t6.sub(i);
        }
    }

}

class T6 {

    private static final int SUB_COUNT = 10;
    private static final int MAIN_COUNT = 100;

    private boolean doSub;

    synchronized void sub(int roundIndex) {
        while (!doSub) {
            try {
                wait();
            } catch (InterruptedException e) {
                //ignore
            }
        }
        for (int i = 0; i < SUB_COUNT; i++) {
            System.out.println("sub " + i + " of " + roundIndex);
        }
        doSub = false;
        notifyAll();
    }

    synchronized void main(int roundIndex) {
        while (doSub) {
            try {
                wait();
            } catch (InterruptedException e) {
                //ignore
            }
        }
        for (int i = 0; i < MAIN_COUNT; i++) {
            System.out.println("main " + i + " of " + roundIndex);
        }
        doSub = true;
        notifyAll();
    }

}
