package java1702.javase.e;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/21.
 * JavaSE_20171.
 */
//输出9*9口诀
public class E16 {
    public static void main(String[] args) {
        for (int i = 0; i < 9 ; i++) {
            for (int j = 0; j < i ; j++) {
                if (i >= j) {
                System.out.print((j + 1) + "*" + (i + 1) + "=" + (i + 1) * (j + 1) +"\t" );//  "\t":在同一个缓冲区内横向跳8个空格
                }
            }
            System.out.println();
        }
    }
}
