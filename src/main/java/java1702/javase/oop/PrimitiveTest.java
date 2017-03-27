package java1702.javase.oop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/27.
 * JavaSE_20171.
 */
public class PrimitiveTest {
    public static void method(String s){
        System.out.println("b:" + s);
         s = "hi";
        System.out.println("c:" + s);
    }
    //String(引用数据类型)为特殊的类可理解为与基本数据类型相同的值传递

    public static void main(String[] args) {
        String s = "hello";
        System.out.println("a:" + s);
        method(s);
        System.out.println("d:" + s);
    }
}
