package java1702.javase.reflect.demo.c;

import java.util.Arrays;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/5.
 * JavaSE_20171.
 */
public class Father {
}
interface InterfaceTest{}
class Son extends Father implements InterfaceTest{
    public static void main(String[] args) throws ClassNotFoundException {
        // 1. Son > Father
        // 2. Son > InterfaceTest
        Class clazz = Class.forName("java1702.javase.reflect.demo.c.Son");
        System.out.println(clazz.getSuperclass().getSimpleName());
        System.out.println(clazz.getInterfaces()[0].getSimpleName());
        System.out.println(clazz.getName());
    }
}

