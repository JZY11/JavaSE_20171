package java1702.javase.reflect;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/3.
 * JavaSE_20171.
 */
class Animals{
    public int age;
    private double weight;

    public Animals() {
    }

    public Animals(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }
    public int sleep(int hours){
        return hours;
    }
    public void eat(String food){
        System.out.println("eating" + food);
    }

}
public class Human {

}
