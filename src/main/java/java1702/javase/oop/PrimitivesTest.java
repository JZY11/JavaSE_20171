package java1702.javase.oop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/24.
 * JavaSE_20171.
 */
public class PrimitivesTest {
    public static void method(int i) {
        System.out.println("b:" + i);
        i++;
        System.out.println("c:" + i);
    }

    public static void main(String[] args) {
        int i = 0;
        System.out.println("a:" + i);
        method(i);
        System.out.println("d:" + i);
    }
}
