package java1702.javase.oop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/23.
 * JavaSE_20171.
 */
public interface InterfaceTest {//接口是迎来被实现的
     int i = 1;//接口的域都是公有的常量(public static final)
     void m();//接口的方法都是公有抽象方法(public abstract)
}
interface A{//多个接口中也可以有域  被继承(接口要有创建对象，然后再调用，对于他们的子（实现）类做了限制和约束）
    int i = 1;
    void c();

}interface B{
    int i = 2;
    void d();

}interface C{
    int i = 3;
    void e();
}interface D{
    int i = 4;
    void f();
}
//class IterfaceTestImpl implements InterfaceTest, A , B, C, D{
//
//    @Override
//    public void m() {//java中一个类可以实现多个接口但必须实现类里的所有抽象方法//实现类已经实现接口
//
//    }
//
//    @Override
//    public void c() {
//
//    }
//
//    @Override
//    public void d() {
//
//    }
//
//    @Override
//    public void e() {
//
//    }
//
//    @Override
//    public void f() {//用户接口名来实现ONE
//
//    }
//}
