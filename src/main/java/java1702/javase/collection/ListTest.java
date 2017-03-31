package java1702.javase.collection;

import java.util.ArrayList;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/31.
 * JavaSE_20171.
 */
public class ListTest extends ArrayList {
    public static void main(String[] args) {
        ArrayList<String> strings  = new ArrayList<>();
        strings.add("hello");
        strings.add("whatever");
        strings.add("hello");
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println(strings.size());
        System.out.println(strings.get(0));
        System.out.println(strings.contains("whatever"));
        System.out.println(strings.indexOf("hello"));
        System.out.println(strings.lastIndexOf("hello"));
        System.out.println(strings.remove(0));
        System.out.println(strings.get(0));

        System.out.println(strings.set(1, "test"));
        System.out.println(strings.isEmpty());



        ListTest listTest = new ListTest();//protected  void(受保护的) 需要子类实例化，再调用方法
        for (int i = 0; i < 10; i++) {
            listTest.add("" + i);
        }
        listTest.removeRange(3, 5);

    }
}
