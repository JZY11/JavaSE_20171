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
        //(一)：验证增加数据的操作
        allList.add("Hello");//  从Collection继承的方法
        allList.add(0, "World");//  List扩充的方法
        System.out.println(allList);

        allCollection.add("LXH");//  增加数据
        allCollection.add("www.mldn.cn");
        allList.addAll(allCollection);//  从Collection继承的方法，增加一组对象
        allList.addAll(0, allCollection);//  List自定义的方法，增加一组对象
        System.out.println(allList);
    }
}
class ArrayListDemo1{
    public static void main(String[] args) {
        List<String> allList = new ArrayList<>();
        Collection<String> allCollection = new ArrayList<>();
        allList.add("Hello");
        allList.add(0, "World");
        allList.add("MLDN");
        allList.add("www.mldn.cn");
        allList.remove(0);
        allList.remove("Hello");
        System.out.println(allList);
    }
}
