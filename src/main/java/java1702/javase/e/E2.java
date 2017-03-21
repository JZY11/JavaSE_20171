package java1702.javase.e;

/**
 * Created by Tony.Jaa on 2017/3/8.
 */
public class E2 {
    public static void main(String[] args) {
        for (int i = 100; i < 201; i++) {
            boolean b = true;//b: j 能否整除 i -> j是否为素数
            for (int j = 2; j < i / 2 + 1; j++) {//除数的循环
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }//b == true
            if (b) {// TODO: 2017/3/14
                System.out.println(i);
            }

        }

    }
}
//类是构造对象的模板或蓝图，有类构造对象的过程称为创建类的实例，用Java编写的所有代码都位于某个类的内部，
//标准的Java库提供了几千个类，可以用于用户界面的设计，日期，日历和网络程序设计，尽管如此，还是需要在Java中创建一些自己的类