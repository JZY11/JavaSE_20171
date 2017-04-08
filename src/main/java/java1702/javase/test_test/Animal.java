package java1702.javase.test_test;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/8.
 * JavaSE_20171.
 */
public interface Animal {
    void eat();
}
class Bird implements Animal{
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat();
        bird.flying();
    }
    public void flying(){
        System.out.println("Bird is flying...");
    }
    @Override
    public void eat() {

    }
}
class Fish implements Animal{
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.eat();
        fish.swimming();
    }
    public void swimming(){
        System.out.println("Fish is swimming...");
    }
    @Override
    public void eat() {

    }
}