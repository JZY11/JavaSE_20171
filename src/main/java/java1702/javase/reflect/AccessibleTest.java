package java1702.javase.reflect;

import java.lang.reflect.Field;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/4.
 * JavaSE_20171.
 */
public class AccessibleTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Person person = new Person(29);
        Field age = Class.forName("java1702.javase.reflect.Person").getDeclaredField("age");
        age.setAccessible(true);
        System.out.println(age.get(person));
    }
}
class Person{
    private int age;

    public Person(int age) {
        this.age = age;
    }
}