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
            System.out.println();
        }

    }
}
