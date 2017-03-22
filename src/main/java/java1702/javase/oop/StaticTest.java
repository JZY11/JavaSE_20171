package java1702.javase.oop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/22.
 * JavaSE_20171.
 */
public class StaticTest {
    public static void main(String[] args) {
        ManKind tom = new ManKind();
//        tom.name = "Tom";
        tom.age = 18;
        tom.married = true;
        System.out.println(tom.name);
        System.out.println(tom.age);
        System.out.println(tom.married);

        System.out.println(".................");

        ManKind jerry = new ManKind();
        jerry.name = "Je8rry";
//        jerry.age = 20;
//        jerry.married = true;
        System.out.println(jerry.name);
        System.out.println(jerry.age);
        System.out.println(jerry.married);


    }
}
class ManKind{
    public String name;
    public int age;
    public static boolean married;
}
