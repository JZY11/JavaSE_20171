package java1702.javase.oop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/24.
 * JavaSE_20171.
 */
public class PrimitivesTest {//基本数据类型作为方法参数（值传递）
    public static void method(int x) {//boolean method(boolean b)
        //b = false;
        System.out.println("b:" + x);//("b:"+ b)
        x++;
        System.out.println("c:" + x);//("c:" +b)
    }

    public static void main(String[] args) {
        int i = 0;//boolean i = true;
        System.out.println("a:" + i);//("a:" + i)
        method(i);//
        System.out.println("d:" + i);
    }
}