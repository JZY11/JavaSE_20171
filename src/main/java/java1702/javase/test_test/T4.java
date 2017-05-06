package java1702.javase.test_test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/6.
 * JavaSE_20171.
 */
/*
    使用反射机制获取 java.lang.String 类的所有域、构造方法、成员方法
 */
public class T4 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException {
        String string = new String();
        Class clazz = string.getClass();
        Field field = clazz.getDeclaredField("field");
        field.setAccessible(true);
        System.out.println(field.get(string));

        Constructor constructor = clazz.getDeclaredConstructor();
        System.out.println(constructor.getName());

        Method method = clazz.getDeclaredMethod("string");
        System.out.println(method.getName());
    }
}
class String{
    private int i;
    public void method(){}
}

