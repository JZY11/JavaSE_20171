package java1702.javase.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/15.
 * JavaSE_20171.
 */
/*
输入一段字符串，字符串中只包含大小写字母。要求完成函数删除给定字符串中出现次数最少的字符。输出删除完的字符串。如果有多个出现次数一样的字符，都为最少时，一并删除。
例如：输入:abbccd，输出为bbcc
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字母序列：");
        String input = sc.nextLine();
        System.out.println(new Test4().getMaxCharacters(input));
    }

    public String getMaxCharacters(String input){
        char[] chars = new char[255];
        char[] in = input.toCharArray();

        Set<Character> set = new HashSet<>();//记录所有出现的最大的字符
        int maxCount = 0;//最大的次数
        for (int i = 0; i < in.length; i++) {
            int tempCount = (int)++chars[in[i]];//统计字符出现的次数，数组下标代表字符，数组内容记录次数
            if(tempCount >= maxCount){

                if(tempCount > maxCount)//如果当前的字符次数比最大的大则清除记录
                    set.clear();
                maxCount = tempCount;
                set.add(in[i]);
            }
        }



//        return sb.toString();
    }
}
