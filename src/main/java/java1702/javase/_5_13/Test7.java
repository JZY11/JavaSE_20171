package java1702.javase._5_13;

import java.util.Stack;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/13.
 * JavaSE_20171.
 */
/*
    7. 编写一个程序，开启3个线程，这3个线程的 Name 分别为 A、B、C，
       每个线程将自己的 Name 在屏幕上打印10遍，
       要求输出结果必须按ABC 的顺序显示；如：ABCABC….依次递推
 */
public class Test7 {
    public static void main(String[] args) {
        Thread A = new Thread(new T7(),"A");
        Thread B = new Thread(new T7(),"B");
        Thread C = new Thread(new T7(),"C");
        A.start();
        B.start();
        C.start();

        Stack<String> stack = new Stack<>();
        stack.push("C");
        stack.push("B");
        stack.push("A");
    }
}
class T7 implements Runnable{
    private Stack<String> stack;

//    public T7(Stack<String> stack) {
//        this.stack = stack;
//    }

    @Override
    public void run() {
//        for (int i = 0; i < ; i++) {
//
//        }
    }
}
