package java1702.javase.multiThreading;

import java.util.Stack;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/12.
 * JavaSE_20171.
 */
/*
     如何判断一个集合类是否是线程安全的？？-->主要是看该集合类里的方法是否是很多的同步(synchronized)的方法
     生产者消费者问题::生产者消费者问题,是一个多线程同步问题的经典案例该问题描述了共享固定大小缓冲区的两个线程
     ——即所谓的“生产者”和“消费者”——在实际运行时会发生的问题。生产者的主要作用是生成一定量的数据放到缓冲区中，
     然后重复此过程。与此同时，消费者也在缓冲区消耗这些数据。该问题的关键就是要保证生产者不会在缓冲区满时加入数据，消费者也不会在缓冲区中空时消耗数据
 */
public class ProducerConsumer {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();//将stack对象作为以下两个线程同时拥有的对象,可进行同时操作
//        Thread producer = new Thread(new Producer(stack), "producer");
//        Thread consumer = new Thread(new Producer(stack), "consumer");
//        producer.start();//两个线程开始进入就绪状态
//        consumer.start();


        Thread producer1 = new Thread(new Producer(stack), "p1");
        Thread producer2 = new Thread(new Producer(stack), "p2");
        Thread consumer1 = new Thread(new Consumer(stack), "c1");
        Thread consumer2 = new Thread(new Consumer(stack), "c2");

        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
    }
}

class Producer implements Runnable {
    private static final int MAX = 3;
    private Stack<Integer> stack;// 做一Producer 的成员域 Stack里面放整数
    private static int data; // 初始化时构造方法里与其无关，初始默认值为0

    public Producer(Stack<Integer> stack) {//把Stack做为一个参数传入有参构造方法，创建Producer类的实例时必须调用这个
        //传入一个stack
        this.stack = stack;
    }

    @Override
    public void run() {
        synchronized (stack) {// 同步的代码块   同步stack这个域，对stack这个对象进行一个同步操作，来生产
            while (true) {
                if (stack.size() == MAX) {
                    try {
                        stack.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " produce" + stack.push(data++));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                stack.notifyAll();//唤醒其他线程（消费者）   notify()
            }

        }
    }
}

class Consumer implements Runnable {
    private Stack<Integer> stack;

    public Consumer(Stack<Integer> stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        synchronized (stack) {
            while (true) {
                if (stack.isEmpty()) {//判空条件
                    try {
                        stack.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " consume" + stack.pop());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                stack.notifyAll();//notify
            }
        }
    }
}
