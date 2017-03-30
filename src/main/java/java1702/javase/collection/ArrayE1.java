package java1702.javase.collection;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/30.
 * JavaSE_20171.
 */
//   求出数组中的最大值与最小值
public class ArrayE1 {
    public static void main(String[] args) {
        int[] score = {85, 86, 90, 56, 98, 100};//整形数组的静态初始化
        int max = 0; //定义变量保存最大值
        int min = 0; //定义变量保存最小值
        max = score[0];
        min = score[0];//把元素的第一个内容赋值给max,min
        for (int i = 0; i < score.length; i++) {//循环求出最大与最小
            if (score[i] > max) {//  依次判断后续元素是否比max大
                max = score[i];//  如果大则修改max内容
            } else {
                if (score[i] < min) {//判断后续元素是否比min小
                    min = score[i];
                }
            }
        }
            System.out.println("最高成绩：" +max);
            System.out.println("最低成绩：" +min);
    }
}
