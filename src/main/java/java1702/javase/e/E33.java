package java1702.javase.e;

import java.util.Arrays;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/30.
 * JavaSE_20171.
 */
/*
 打印出杨辉三角形（要求打印出10行如下图）（数组 递归）
    1
   1 1
  1 2 1
 1 3 3 1
.........（略）
 */
public class E33 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j : getArray(i + 1)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        // Arrays是一个类，有一个静态的toString方法(转化为字符串)
//        System.out.println(Arrays.toString(getArray(5)));
//        int[] array1 = {1};
//        int[] array2 = {1,1};
//        int[] array3 = {1, 2, 1};
//        int[] array4 = {1, 3, 3, 1};
////        int[] l5 = {1, 4, 6, 4,1};
//        int[] array5 = new int[5];
//        for (int i = 0; i < array5.length; i++) {
//            if (i == 0 || i == array5.length - 1) {
//                array5[i] = 1;
//
//            } else {
//                array5[i] = array4[i - 1] + array4[i];
//            }
//        }
//        System.out.println(Arrays.toString(getArray(5))); [.... .]为Arrays.toString方法的返回类型为字符串形式
    }
    /**
     *
     * @param n  表示的是第几行
     * @return   第几行的数组
     */

//        int[] ints = new int[1];
//        return ints;  返回  数组名/对象
    private static int[] getArray(int n){//  递归
        if ((n == 1)) {
            return new int[]{1};
        } else {
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                if (i == 0 || i == array.length - 1) {
                    array[i] = 1;
                } else {
                    array[i] = getArray(n - 1)[i - 1] + getArray(n - 1)[i];
                }
            }
            return array;

        }
    }

}
