package java1702.javase.tt;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/1.
 * JavaSE_20171.
 */
/*
   编写一个程序实现以下功能：
   (1)产生5000个(1,9999) [2,9998]之间的随机整数，将其存入文本文件a.txt中
   (2)从文件中读取这5000个整数，并计算其最大值、最小值和平均值并输出结果
 */
public class E4 {
    private static final int N = 5000;

    public static void main(String[] args) {
        int sum = 0;
        int min = 9998;
        int max = 2;
        List<Integer> list = new ArrayList<>();// (2)
        try (
                RandomAccessFile raf = new RandomAccessFile("a.txt", "rw")) {
            for (int i = 0; i < N; i++) {
                int r = (int) (Math.random() * 9997) + 2;
                raf.writeInt(r);
            }
            raf.seek(0);
            for (int i = 0; i < N; i++) {
                int r = raf.readInt();
                list.add(r);
                if (r < min) {
                    min = r;
                }
                if (r > max) {
                    max = r;
                }
                sum += r;
//                System.out.println(raf.readInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(min + ":" + max);
        Collections.sort(list);// (2)
        System.out.println(list.get(0) + ":" + list.get(N - 1));// (2)
        System.out.println("--------------");
        System.out.println(Collections.min(list) + ":" + Collections.max(list));// (3)
        System.out.println(sum / N);
    }
}
