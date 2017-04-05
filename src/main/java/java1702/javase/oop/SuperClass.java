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
    public SubClass (){
        //super();
        System.out.println("in sub class constructor...");
    }
    public void m(){
        System.out.println("m...");
    }
    public boolean getB(){
        return b;
    }
}
class Test{
    public static void main(String[] args) {
        SuperClass supClass = new SuperClass();
        System.out.println(supClass.i);
        supClass.method();

        SubClass subClass = new SubClass();
        System.out.println(subClass.i);
        System.out.println(subClass.getB());
        subClass.method();
        subClass.m();
    }
}
