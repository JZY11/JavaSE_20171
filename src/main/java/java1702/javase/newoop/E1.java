package java1702.javase.newoop;

import java1702.javase.oop.Student;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/11.
 * JavaSE_20171.
 */
public class E1 {
    public static void main(String[] args) {
        ArrayList<student> students = new ArrayList<>();
        students.add(new student("tom", 18, 'M'));
        students.add(new student("jerry", 17, 'F'));
        Iterator<student> iterator = students.iterator();
        while (iterator.hasNext()) {
            student student =  iterator.next();
            System.out.println(student.getName());
            System.out.println(student.getAge());
            System.out.println(student.getGender());
        }
    }
}

class student {
    private String name;
    private int age;
    private char gender;

    public student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}
