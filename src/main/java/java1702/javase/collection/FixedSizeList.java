package java1702.javase.collection;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/2.
 * JavaSE_20171.
 */
/*
   工具类Arrays的asList()方法 可将一个数组或者指定个数的对象转换为一个List集合
   这个List集合既不是ArrayList实现类的实例，也不是Vector实现类的实例，而是Arrays的内部类ArrayList的实例
   Arrays.ArrayList是一个固定长度的List集合，程序只能遍历访问该集合里的元素
   不可增加、删除该集合里的元素
 */
public class FixedSizeList {
    public static void main(String[] args) {
        List fixedList = Arrays.asList("疯狂Java讲义", "疯狂ios讲义");
        //获取fixedList的实现类，将输出Arrays$ArrayList
        System.out.println(fixedList.getClass());
//        fixedList.forEach(System.out::println);// 使用方法引用遍历集合元素
        //试图增加、删除元素都会引发异常
        fixedList.add("疯狂Android讲义");
        fixedList.remove("疯狂Java讲义");

    }
}
