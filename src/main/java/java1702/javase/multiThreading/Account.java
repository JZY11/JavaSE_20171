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

    void withdraw(int money){
        System.out.println(Thread.currentThread().getName());
        if (this.money - money < 0) {
            System.out.println("Not enough...");
            return;
        }
        try {
            Thread.sleep(1000 * 3);
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
    private static Account account = new Account(1000);


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