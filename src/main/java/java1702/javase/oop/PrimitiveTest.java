package java1702.javase.oop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/27.
 * JavaSE_20171.
 */
public class PrimitiveTest {
    public static void method(boolean b){
        System.out.println("b:" + b);
        b = false;
        System.out.println("c:" + b);
    }

    public static void main(String[] args) {
        boolean b = true;
        System.out.println("a:" + b);
        method(b);
        System.out.println("d:" + b);
    }
}
