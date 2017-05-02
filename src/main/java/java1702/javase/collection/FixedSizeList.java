package java1702.javase.collection;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/2.
 * JavaSE_20171.
 */
public class FixedSizeList {
    public static void main(String[] args) {
        List fixedList = Arrays.asList("疯狂Java讲义", "疯狂ios讲义");
                       //工具类Arrays的asList()方法 可将一个数组或者指定个数的对象转换为一个List集合
        //获取fixedList的实现类，将输出Arrays$ArrayList
        System.out.println(fixedList.getClass());
//        fixedList.forEach(System.out::println);// 使用方法引用遍历集合元素
        //试图增加、删除元素都会引发异常
        fixedList.add("疯狂Android讲义");
        fixedList.remove("疯狂Java讲义");

    }
}
