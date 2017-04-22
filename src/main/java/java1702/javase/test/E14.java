package java1702.javase.test;

import java.io.*;
import java.util.Random;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/22.
 * JavaSE_20171.
 */
/*
      编写一个程序实现以下功能:
      (1)产生5000个1~9999之间的随机整数,将其存入文本文件a.txt中
      (2)从文件中读取这5000个整数,并计算其最大值、最小值和平均值并输出结果。
 */
public class E14 {
    public static void main(String[] args) {
        String fileName = "a.txt";
        WritaDate(5000, fileName);
        ReedDate(fileName);
    }


    public static void WritaDate(int num, String fileName) {
        try {
            Writer writer = new FileWriter(fileName);
            int i, temp;
            Random random = new Random();
            for (i = 0; i < num; i++) {
                do {
                    temp = random.nextInt(10000);
                } while (temp < 1 || temp > 9999);
                writer.write(temp + "\n");
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void ReedDate(String fileName) {
        int count = 0;
        int temp;
        long sum = 0;
        int max = 0;
        int min = 10000;
        double avg;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String str;
            while ((str = reader.readLine()) != null){
                count++;
                temp = Integer.parseInt(str);
                sum += temp;
                if (temp < min) {
                    min = temp;
                } else if (temp > max){
                    max = temp;
                }
            }
            avg = 1.0 * sum / count;
            System.out.println("最大值：" + max);
            System.out.println("最小值：" + min);
            System.out.println("平均值：" + avg);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
