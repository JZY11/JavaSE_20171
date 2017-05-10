package java1702.javase.multiThreading;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/10.
 * JavaSE_20171.
 */
public class Account {
    private int money;

    public Account(int money) {
        this.money = money;
    }
//同步多个线程只有一个对象，同步起作用，锁的概念，某一线程访问了后，其他线程就不能再访问
    //一个线程只能访问一个类的一个 synchronized static 方法，对这个类的所有对象都适用
    synchronized void withdraw(int money) {//(1)synchronized:['sɪŋkrənaɪzd](同步)方法修饰符，加在方法前，与线程关系密切
                                              //(2):写synchronized block语句块-->synchronized(){},将需要同步的代码放入花括号即可
        System.out.println(Thread.currentThread().getName());
        if (this.money - money < 0) {
            System.out.println("Not enough...");
            return;
        }
        try {
            Thread.sleep(1000 * 3);//sleep方法不影响同步，但wait能影响
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.money -= money;
        System.out.println(Thread.currentThread().getName() + "-->get the money...");
    }

    public int getMoney() {
        return money;
    }
}

class Person implements Runnable {
    private static Account account = new Account(1000);//域private static Account account
                                                                // 上一个类的实例


    @Override
    public void run() {
        account.withdraw(1000);
    }
    public static void main(String[] args) {
        Thread boy = new Thread(new Person(),"boy");
        Thread girl = new Thread(new Person(), "girl");
        boy.start();
        girl.start();

        try {
            boy.join();
            girl.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("remain money:" + account.getMoney());
    }
}