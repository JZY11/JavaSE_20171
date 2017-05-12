package java1702.javase.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/29.
 * JavaSE_20171.
 */
public class StringVsStringBufferTest {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";//定义一个常量
    public static void main(String[] args) {
        String s = "";
        StringBuffer stringBuffer = new StringBuffer("");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
//            s += ALPHABET;
            stringBuffer.append(ALPHABET);
        }
        System.out.println("time:" + (System.currentTimeMillis() - start));
//        System.out.println(s.length());

        System.out.println(stringBuffer.length());
    }
}
