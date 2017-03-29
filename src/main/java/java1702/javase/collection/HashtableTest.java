package java1702.javase.collection;

import java.util.Hashtable;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/29.
 * JavaSE_20171.
 */
//       put get size keySet values entrySet remove put
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(1, "hi");
        hashtable.put(2, "hello");
        hashtable.put(3, "hello");
        hashtable.put(3, "hi");//键是唯一的
        System.out.println("size:" + hashtable.size());
        System.out.println(hashtable.get(2));
        System.out.println(hashtable.contains("hi"));
//        hashtable.remove(1);
        System.out.println(hashtable.size());
        for (Integer integer : hashtable.keySet()) {//get方法中：设置   现在：集合
            System.out.println(integer + "-->" + hashtable.get(integer));
        }
        for (String s : hashtable.values()) {
            System.out.println(s);
        }


    }
}
