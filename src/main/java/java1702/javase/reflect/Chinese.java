package java1702.javase.reflect;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/3.
 * JavaSE_20171.
 */
/*
     Class类   是一个泛型类
 */
public class Chinese extends java1702.javase.basic.Human {
    private int i;

    public Chinese(int i) {
        this.i = 1;
    }
    public void m(String s){
        System.out.println(s);
    }
}// Class<Chinese> chinese

class ChineseTest {// Run time 运行时
    public static void main(String[] args) throws ClassNotFoundException {
        Chinese chinese = new Chinese(1);
        // 实例对象(类对象)获取的三种方法
        Class<Chinese> chineseClass1 = Chinese.class;
        Class chineseClass2 = chinese.getClass();
        Class chineseClass3 = Class.forName("java1702.javase.reflect.Chinese");
    }
}

// ArrayList内部capacity的获取就用到了反射
// 1.编辑  Chinese.java
// 2.编译  Chinese.class <> byte code
// 3.运行  将字节码文件转化为当前类的实例(JVM中的java.lang.Class实例对象)
// 反射   可根据当前类的实例调用某种get方法来获取当前类的一些信息