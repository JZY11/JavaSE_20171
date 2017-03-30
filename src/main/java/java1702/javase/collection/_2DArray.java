package java1702.javase.collection;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/28.
 * JavaSE_20171.
 */
//         二维数组
public class _2DArray {
    public static void main(String[] args) {
        int[][] ints = new int[3][5];//二维数组对象创建完成（三行五列）
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(ints[i][j] + "\t");
            }
            System.out.println();// 也可(" ")换行
        }
        /*    不规则的二维数组  注意每行列数不同的二维数组
        1, 2, 3, 4, 5,
        1
        1, 2, 3
        1, 2, 3, 4
         */
        //  (1)
        String[][] strings = new String[4][];
        strings[0] = new String[5];
        strings[1] = new String[1];
        strings[2] = new String[3];
        strings[3] = new String[4];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                System.out.print(strings[i] + "\t");
            }
            System.out.println();
        }

        //   (2)
        double[][] doubles =
                {
                        {1d, 2d, 3d, 4d, 5d},
                        {1d},
                        {1d, 2d,3d},
                        {1d, 2d, 3d,4d}
                };
        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles[i].length; j++) {
                System.out.print(doubles[i] + "\t");
            }
            System.out.println();
        }

    }
}
class Array1{
    public static void main(String[] args) {
        int[][] score ={{67, 61}, {78, 69, 20}, {11, 20, 63, 47}};
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {//当前行
                System.out.print(score[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}
