package java1702.javase.oop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/22.
 * JavaSE_20171.
 */
public class StaticBlockTest {
    class Test{
        int i;
        double d;
    }
    private int i;
    private boolean b;

    public StaticBlockTest() {
        System.out.println("in constructor...");
    }
    static {//静态块在类加载时自动执行一次, 之后不再执行且第一次先执行
        // static block 静态块
        System.out.println("static block...");
    }
    public void m(){

    }
    public static void main(String[] args) {
        StaticBlockTest staticBlockTest1 = new StaticBlockTest();
        StaticBlockTest staticBlockTest2 = new StaticBlockTest();
    }
}
