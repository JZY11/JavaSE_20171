package java1702.javase.tt;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/1.
 * JavaSE_20171.
 */
/*
   输入一段字符串，字符串中只包含大小写字母。要求完成函数删除给定字符串中
   出现次数最少的字符。输出删除完的字符串。如果有多个出现次数一样的字符，
   都为最少是时，一并删除。
   例如：输入：abbccd，输出为：bbcc
 */
public class t4 {
    public static void main(String[] args) {
        String s = "abcbcd";







        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.get(c) == null ? 1 : map.get(c) + 1);
        }
        System.out.println(map);
        int min = Collections.min(map.values());
        System.out.println(min);
        StringBuffer stringBuffer = new StringBuffer(s);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == min) {
//                map.remove(entry.getKey());
                System.out.println(entry.getKey());
                for (int i = 0; i < stringBuffer.length(); i++) {
                    if (stringBuffer.charAt(i) == entry.getKey()) {
                        stringBuffer.deleteCharAt(i);
                    }

                }
            }
        }
        System.out.println(stringBuffer);
    }
}
