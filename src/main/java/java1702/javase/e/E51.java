package java1702.javase.e;

/**
 * Created by Tony.Jaa on 2017/3/14.
 */
/*
*     recursive call 递归调用
 */
public class E51 {//类里面是可以写方法的，方法表示行为和功能

    public int fibonacci(int n) {//定义另外一个方法  返回类型为整型int
        if (n == 1 || n == 2) {
            return 1;
        }
        else{
            return fibonacci(n-2) + fibonacci(n-1) ;//当前方法中又含有对其自身的一个调用
            //return 再次调用方法本身
        }
    }

    public static void main(String[] args) {//用对象（new)来调用fibonacci方法 此类有隐藏的默认构造方法
        E51 e51 = new E51();//调用无参默认方法   创建当前类的实例
        System.out.println(e51.fibonacci(1));//调用斐波那契额第n项的方法

    }
}
