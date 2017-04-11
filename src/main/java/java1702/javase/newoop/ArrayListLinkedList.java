package java1702.javase.newoop;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/11.
 * JavaSE_20171.
 */
public class ArrayListLinkedList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i + "");
            linkedList.add(i + " ");
        }
            long time1 = System.currentTimeMillis();
            System.out.println(arrayList.get(50000));
            long time2 = System.currentTimeMillis();
            System.out.println(linkedList.get(50000));
            long time3 = System.currentTimeMillis();
            System.out.println("arrayList:" + (time2 - time1));
            System.out.println("linkedList:" + (time3 - time2));
    }
}
