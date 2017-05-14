package java1702.javase.basic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/14.
 * JavaSE_20171.
 */
public class Father_Network {
    public int age ;

    Father_Network() {
        age = 50;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Child extends Father_Network{
    private int age;

    public Child() {
        super();
        age = 25;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
    public void printAge(){
        System.out.println("访问方法：");
        System.out.println("Child age:" + getAge());
        System.out.println("Father age:" + super.getAge());
        System.out.println("访问变量");
        System.out.println("Child age:" + age);
        System.out.println("Father age:" + super.age);
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.printAge();
    }
}
