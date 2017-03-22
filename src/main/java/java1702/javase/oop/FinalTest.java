package java1702.javase.oop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/21.
 * JavaSE_20171.
 */
public class FinalTest {//修饰类则该类不能再被继承了（不能再作为父类类使用）
    private final int i;//修饰域必须要初始化  一旦初始化后就不可再改变
    private double b = 1d;

    public FinalTest(int i, double b) {
        this.i = i;
        this.b = b;
    }
    public final void method(){//(1):声明的同时已经初始化(2):在构造方法中被初始化  初始化后就不能被修改
    }
}
//class SubFinalTest extends FinalTest{
//    SubFinalTest() {
//        super(i);
//    }
//}
