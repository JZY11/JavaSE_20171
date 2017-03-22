package java1702.javase.oop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/21.
 * JavaSE_20171.
 */
//abstract只能修饰类和方法，抽象方法必须在抽象的类里  被作为父类来实现的
    //抽象类可以放具体方法的   抽象类里既可以有抽象又可以有具体方法
public abstract class AbstractTest {//抽象类
    private int i;//不能修饰域
    public abstract void method();//抽象方法不能有方法体,去掉大括号    抽象类的作用：对其所有的子类做了一种限制和约束
    public void method2(){
    }
    //若类是抽象的而方法不是抽象的话需要方法带有方法体
    public static void main(String[] args) {
        SubAbstrctTest subAbstrctTest = new SubAbstrctTest();
//        System.out.println(subAbstrctTest);
        subAbstrctTest.method();
//        AbstractTest abstractTest = new AbstractTest();//抽象的类不能被实例化(instanced)
    }
}
class SubAbstrctTest extends AbstractTest{

    @Override
    public void method() {//实现即添加方法体的过程  已实现   对父类抽象方法的实现
        System.out.println("in Sub.......");
    }

    @Override
    public void method2() {//不是抽象方法而是具体方法  次为对父类对象的重写或覆盖  左边图案的颜色都不一样
        super.method2();
    }
}
