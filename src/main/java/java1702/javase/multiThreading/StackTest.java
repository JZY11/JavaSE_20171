package java1702.javase.multiThreading;

import java.util.Stack;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/12.
 * JavaSE_20171.
 */
/*
    Stack也是一个集合类(栈)，后进先出 LIFO ：Last In First Out
    Queue:队列  先进先出 FIFO ：First In Fist Out
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> strings = new Stack<>();
        strings.push("hello");// push 推 往里存数据
        strings.push("hey");
        strings.push("test");

        System.out.println(strings.pop());//pop 弹出 取出数据
        System.out.println(strings.pop());
        System.out.println(strings.pop());
    }
}
