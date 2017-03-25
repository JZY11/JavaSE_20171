package java1702.javase.oop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/25.
 * JavaSE_20171.
 */
public class Animal {
    public static void main(String[] args) {

    }
    private String name;
    private boolean eatMeat;
    private int age;
    public void eat(){
    }
    public void sleep(){
    }
    public void cry(){

    }
}
class Cat extends Animal{
    private double weight;
    private int type;
    public void eatFish(){

    }
    public void catchMouse(){

    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void cry() {
        super.cry();
    }
}

