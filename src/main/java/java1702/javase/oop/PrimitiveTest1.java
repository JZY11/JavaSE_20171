package java1702.javase.oop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/27.
 * JavaSE_20171.
 */
public class PrimitiveTest1 {
    private String s;
    private static void method(PrimitiveTest1 primitiveTest1){
        System.out.println("b:" + primitiveTest1.s);
        primitiveTest1 .s = "hi";
        System.out.println("c:" + primitiveTest1.s);
    }
    //引用数据类型(类)方法中的改变会影响实际参数

    public static void main(String[] args) {
        PrimitiveTest1 primitiveTest1 = new PrimitiveTest1();
        primitiveTest1.s = "hello";
        System.out.println("a:" + primitiveTest1.s);
        method(primitiveTest1);
        System.out.println("d:" + primitiveTest1.s);
    }
}
