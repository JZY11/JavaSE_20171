package java1702.javase.oop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/20.
 * JavaSE_20171.
 */
public class DefaultClass1 {
    private int i;
    protected void method(){
        System.out.println(i);
    }

    public static void main(String[] args) {
        DefaultClass1 defaultClass1 = new DefaultClass1();
        System.out.println(defaultClass1.i);
    }
}
class DefoultClass1Test{
    public boolean b;

    public static void main(String[] args) {
        DefaultClass1 defaultClass1 = new DefaultClass1();
//        System.out.println(defaultClass1.i);
    }
}
