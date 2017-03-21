package java1702.javase.basic;

/**
 * Created by Tony.Jaa on 2017/3/16.
 */
/*
*     三个类为并列关系  继承是为了实现代码的重用  提高软件开发的效率
*     继承关系是连续的可以传递的
 */
public class Father {
    int money;
    public void coding(){
        System.out.println("java1702.javase.basic.Father is coding....");
    }

}

class Son extends Father{

}
class ExtendsTest{
    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.money);//0
        father.coding();//java1702.javase.basic.Father is coding....

        Son son = new Son();
        System.out.println(son.money);
        son.coding();
    }
}
