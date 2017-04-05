package java1702.javase.collection;

import java.util.*;
import java.util.ArrayList;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/5.
 * JavaSE_20171.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> allList = new ArrayList<>();//声明并实例化List对象
        Collection<String> allCollection = new ArrayList<>();//声明并实例化Collection对象
        allList.add("Hello");
        allList.add(0, "World");
        System.out.println(allList);
    }
}
