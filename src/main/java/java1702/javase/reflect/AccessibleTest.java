package java1702.javase.reflect;

import java.lang.reflect.Field;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/4.
 * JavaSE_20171.
 */
/*
         Field实际使用场景，获取一个域，修改一个域
         利用反射机制   关于域(获取私有域)
 */
public class AccessibleTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Person person = new Person(29);
        Field age = Class.forName("java1702.javase.reflect.Person").getDeclaredField("age");
        age.setAccessible(true);//暴力访问(设置访问)
        System.out.println(age.get(person));// get()方法返回指定对象上此 Field 表示的字段的值
        System.out.println("以下设置age");
        age.setInt(person, age.getInt(person) + 1);//setInt()将字段的值设置为指定对象上的一个 int 值
        System.out.println(age.getInt(person));
        //getint()获取 int 类型或另一个通过扩展转换可以转换为 int 类型的基本类型的静态或实例字段的值
    }
}
class Person{
    private int age;

    public Person(int age) {
        this.age = age;
    }
}