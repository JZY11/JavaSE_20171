package java1702.javase.reflect;

import java.lang.reflect.Field;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/4.
 * JavaSE_20171.
 */
public class AccessibleTest {
    public static void main(String[] args) throws NoSuchFieldException {
//        Person person = new Person(29);
//        System.out.println(person.age);
        Person person = new Person(29);
        Class clazz = person.getClass();
        Field field = clazz.getDeclaredField("clazz");
        field.setAccessible(true);
        System.out.println(field);
    }
}
class Person{
    private int age;

    public Person(int age) {
        this.age = age;
    }
}