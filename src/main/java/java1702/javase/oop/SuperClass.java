package java1702.javase.oop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/5.
 * JavaSE_20171.
 */
public class SuperClass {
    int i;
    public SuperClass(){}

    public SuperClass(int i) {
        this.i = i;
        System.out.println("in super class constructor...");
    }
    public void method(){
        System.out.println("method...");
    }
}
class SubClass extends SuperClass{
    private boolean b;
}
