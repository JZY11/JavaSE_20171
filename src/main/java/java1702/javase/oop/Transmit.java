package java1702.javase.oop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/25.
 * JavaSE_20171.
 */
public class Transmit {
    public static void method(int x) {
        System.out.println("b:" + x);
        x++;
        System.out.println("c:" + x);
    }

    public static void main(String[] args) {
        int i = 0;
        System.out.println("a:" + i);
        method(i);
        System.out.println("d:" + i);
    }
}
