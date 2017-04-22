package java1702.javase.test;

import java.io.*;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/22.
 * JavaSE_20171.
 */
/*
      编写一个程序,其功能是将两个文件的内容合并到一个文件中
      例如：1.txt 内容为 abc；2.txt 内容为 def；生成新文件3.txt 内容为 abcdef
 */
public class E13 {
    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader("src/main/java/java1702/javase/test/1.txt"));
                BufferedReader reader1 = new BufferedReader(new FileReader("src/main/java/java1702/javase/test/2.txt"));
                BufferedWriter out = new BufferedWriter(new FileWriter("src/main/java/java1702/javase/test/3.txt"));
        ) {
            int i;
            while ((i = reader.read()) != -1) {
                out.write(i);
            }
            int j;
            while ((j = reader1.read()) != -1) {
                out.write(j);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
