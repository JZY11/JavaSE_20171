package java1702.javase.tt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/1.
 * JavaSE_20171.
 */
public class tt {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        for (int i = 0; i < ints.length; i++) {
            if (i!=1) {
                System.out.println(ints[i]);
            }
        }
        System.out.println("---------");
        for (int anInt : ints) {
            System.out.println(anInt);
        }
        System.out.println("=============");
        List<Integer> list = new ArrayList<>();
        list.add(123);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println("->->->->->");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
