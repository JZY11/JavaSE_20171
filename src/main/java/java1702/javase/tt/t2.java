package java1702.javase.tt;

import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/30.
 * JavaSE_20171.
 */
/*
   找出字符串中出现次数最多的字母和出现的次数
 */
public class t2 {
    public static void main(String[] args) {
        String s = "aabbbcccddddffff";
        Hashtable<Character, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hashtable.put(c, hashtable.get(c)==null?1:hashtable.get(c) + 1);
        }
        int max = Collections.max(hashtable.values());// Collections工具类的max方法,返回Collection<Integer>
//        int max = 0;
//        for (Map.Entry<Character, Integer> entry : hashtable.entrySet()) {
//            if(max < entry.getValue()){
//                max = entry.getValue();
//            }
//        }
        System.out.println(max);

        for (Map.Entry<Character, Integer> entry : hashtable.entrySet()) {
            if (max == entry.getValue()) {
                System.out.println(entry.getKey());
            }

        }




//        int max = 0;
//        char c = 0;
//        for (int i = 0; i < s.length(); i++) {
//            int counter = 0;
//            for (int j = 0; j < s.length(); j++) {
//                if(s.charAt(i) == s.charAt(j)){
//                    counter++;
//                }
//            }
//            if (counter >= max) {
//                max = counter;
//                c = s.charAt(i);
//            }
//        }
//        System.out.println(c + ":" + max);
    }
}
