package java1702.javase.basic;

/**
 * Created by Tony.Jaa on 2017/3/18.
 */
public class Person {
    private String name;
    private char gender;
    private int age;

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public Person(){

    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
class Student extends Person{
    String number;
    public Student(){
    }
    public String getNumber() {
        return number;
    }
}
class PersonTest{
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getNumber());
        System.out.println(student.getName());
        System.out.println(student.getGender());
        System.out.println(student.getAge());
    }
}

