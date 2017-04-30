package java1702.javase.tt;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/1.
 * JavaSE_20171.
 */
/*
   写出一个程序，接受一个浮点数值，输出该数值的近似整数值
   如果小数点后数值大于等于5，向上取整，小于5向下取整
   例如：-4.5 四舍五入的结果是-4
          4.4 四舍五入的结果是4
*/
public class t5 {
    public static void main(String[] args) {
        double d1 = -4.5;//-4
        double d2 = 4.4;// 4
        System.out.println(Math.round(d1));
        System.out.println(Math.round(d2));
    }
}
