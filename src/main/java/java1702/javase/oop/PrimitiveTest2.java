package java1702.javase.oop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/27.
 * JavaSE_20171.
 */
//     基本数据类型的封装类(还是值传递)
public class PrimitiveTest2 {
    public static void method(Integer integer) {
        System.out.println("b:" + integer);// 0
        integer = new Integer(1);
        System.out.println("c:" + integer);// 1
    }

    public static void main(String[] args) {
        Integer integer = new Integer(0);//主方法中创建整形封装类类的实例
        System.out.println("a:" + integer);// 0
        method(integer);
        System.out.println("d:" + integer);// 0
    }
}
