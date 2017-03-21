package java1702.javase.basic;

/**
 * Created by Tony.Jaa on 2017/3/15.
 */
public class DuiXiang {
    public static void main(String[] args) {
        Human tom = new Human();//new 后跟的为一个类的构造方法  调用无参  new了Human的tom
        //调用有参  参数为类中的域
                System.out.println(tom.name);//name null
        Human jerry = new Human(false , "jerrty" , 18 , 40 , "female");
        System.out.println(jerry.age);// 调用有参
        jerry.read();//对象+.域/方法
    }
}
