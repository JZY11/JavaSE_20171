package java1702.javase.newoop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/6.
 * JavaSE_20171.
 */
/*
*   已知有一个数列：f(0) = 1, f(1) = 4, f(n + 2) = 2 * f(n + 1) + f(n),求f(10)
*   可以用递归方法求得（一个方法体内调用它自身，被称为方法递归。方法递归包含了
*   一种隐式循环，它会重复执行某段代码，但这样重复无须循环控制）
 */
public class Recursive {
    public static int fn(int n){
        if (n == 0) {
            return 1;
        } else if (n == 1){
            return 4;
        }else {
            return 2 * fn(n - 1) + fn(n - 2);//fn方法里调用fn的形式
        }
    }

    public static void main(String[] args) {
        System.out.println(fn(10));
    }
}
   //
