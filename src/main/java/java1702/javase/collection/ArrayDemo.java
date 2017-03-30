package java1702.javase.collection;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/30.
 * JavaSE_20171.
 */
//   数组为引用数据类型
public class ArrayDemo {// 向方法中传递数组
    public static void main(String[] args) {
        int[] tempt = {1, 3, 5};
        fun(tempt);// 传递数组引用(将一个整型数组tempt传递到了方法fun()之中)
        for (int i = 0; i < tempt.length; i++) {// 循环输出
            System.out.print(tempt[i] + "-->");

        }
    }
    public  static void fun(int[] x){//  接受整型数组引用(用数组x接受)
        x[0] = 6;//  修改第一个元素的内容，修改结果也将保存下来
    }
}
