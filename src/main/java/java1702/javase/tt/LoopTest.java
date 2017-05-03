package java1702.javase.tt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/3.
 * JavaSE_20171.
 */
public class LoopTest {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};// 定义一个整型数组
        for (int i = 0; i < ints.length; i++) {
            if (i != 1) {
                System.out.println(ints[i]);
            }
        }
        System.out.println("--------");
        for (int anInt : ints) {
            System.out.println(anInt);
        }
        List<Integer> list = new ArrayList<>();
        list.add(123);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("========");
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println("-=-=-=-=-=-=-");
        Iterator<Integer> iterator = list.iterator();// 迭代器循环
                                                    //  list对象调用iterator()fangfa
                                                    // 返回Iterator<Integer>
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
