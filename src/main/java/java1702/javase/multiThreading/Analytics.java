package java1702.javase.multiThreading;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/11.
 * JavaSE_20171.
 */
/*
     思路：
     将bj目录下的文件都读一遍，每个文件里读取每一行，每一行要的不是全部的东西，只要总价信息
     然后进行一个排序来取得最高值、最低值，做一个循环计算出总的价钱除以size就得到平均价钱
 */
public class Analytics {
    //定义读取文件数组
    private static final String[] fileNames =

            {
                    "dongcheng",
                    "xicheng",
                    "chaoyang",
                    "haidian",
                    "fengtai",
                    "shijingshan",
                    "tongzhou",
                    "changping",
                    "daxing",
                    "yizhuangkaifaqu",
                    "shunyi",
                    "fangshan",
                    "mentougou",
                    "pinggu",
                    "huairou",
                    "miyun",
                    "yanqing",
                    "yanjiao"
            };
    private static final String PATH = "data/bj/";
    private static int counter;//统计下一共多少行

    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();//不可保存重复的元素
        for (String fileName : fileNames) {
            Set<String> set = new HashSet<>();//不可保存重复的元素
            //每次读取一个文件获取它的值
            try (BufferedReader reader = new BufferedReader(new FileReader(PATH.concat(fileName)))) {
                String line;// 一行一行的读取
                while ((line = reader.readLine()) != null) {
                    set.add(line);
//                    try {
//                        String[] strings = line.split("@");
//                        set.add(Double.parseDouble(strings[strings.length - 2]));
//////                        set.add(Double.parseDouble(line.split("@")[3]));
//                    } catch (NumberFormatException e) {
//                        System.out.println(line);
//                    }
//                    set.add(Integer.parseInt(line.split("@")[3]));//总价不全是整数，所以不可
//                    counter++;
                }
            } catch (FileNotFoundException e) {
                System.out.println(fileName + "is not exit.");

            } catch (IOException e) {
                e.printStackTrace();
            }
            List<Double> list = new ArrayList<>();
            for (String s : set) {

                String[] strings = s.split("@");
                list.add(Double.parseDouble(strings[strings.length - 2]));
////                        set.add(Double.parseDouble(line.split("@")[3]));

            }
            Collections.sort(list);
//            System.out.print(list.get(0) + ",");
            System.out.print(list.get(list.size() - 1) + ",");
            double sum = 0;
            for (Double aDouble : list) {
                sum += aDouble;
            }
            System.out.print(Math.round(sum / list.size()) + ",");
//            System.out.println("---");
        }
//        System.out.println("counter:" + counter);

//        System.out.println(set.size());//去掉重复之后的套数
    }
}
