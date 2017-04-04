package java1702.javase.collection;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/28.
 * JavaSE_20171.
 */
public class Game {
    private static  final char[] COLORS = {'A', 'B', 'C', 'D', 'E', 'F',};
    public static void main(String[] args) {
        char[][] squar = new char[10][10];//定义一十行十列的二维数组
        for (int i = 0; i < squar.length; i++) {
            for (int j = 0; j < squar[i].length; j++) {
                squar[i][j] = COLORS[(int)(Math.random() * 6)];// COLORS内的内容为下标
                System.out.println(squar[i][j] + "\t");//或者为 + " "
            }
        }
    }
}
