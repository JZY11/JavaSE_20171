package java1702.javase.oop;
import static java.lang.System.out;//out 为域
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
        ManKind.earth = "tom 人类只有一个地球";//类调用域         //tom.earth = ....对象调用域
        out.println(tom.name);
        System.out.println(tom.age);
        System.out.println(tom.married);
        System.out.println(tom.earth);

        System.out.println(".................");

        ManKind jerry = new ManKind();
        jerry.name = "Jerry";
//        jerry.age = 20;
//        jerry.married = true;
        //ManKind.earth = "jerry...";
        System.out.println(jerry.name);
        System.out.println(jerry.age);
        System.out.println(jerry.married);
        System.out.println(jerry.earth);


    }
}
class ManKind{//人类只有一个地球
    public String name;
    public int age;
    public static boolean married;//静态的域共享
    public static String earth;
}
