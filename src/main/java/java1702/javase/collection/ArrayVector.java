package java1702.javase.collection;

import java.util.Vector;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/30.
 * JavaSE_20171.
 */
// add   remove  set  get  size  capacity
public class ArrayVector {
    public static void main(String[] args) {
        Vector<Integer> integers = new Vector<>();
        //  1. add
        integers.add(100);
        integers.add(200);
        integers.add(300);
        System.out.println(integers.size());
        System.out.println(integers.capacity());

        //  2. remove

        integers.remove(1);//***
        System.out.println(integers.size());
        System.out.println(integers.get(1));


        //3.  修改

//        integers.set(0,1);//将100改为了1
        System.out.println(integers.get(0));
        System.out.println(integers.set(0,1));// get和remove 有返回值的   返回修改之前的值100，但其值已经改为1了


        //4. 查询   可用get代替(返回任何一个索引处的值  )

    }
}
class ArrayVector1{//  使用数组来模拟一个变量   DynamicArray(动态数组)
    private static final int DEFAULT_CAPACITY = 10;
    private String[] strings;
    private int capacity;
    private int size;
    public ArrayVector1(){
        strings = new String[DEFAULT_CAPACITY];
        capacity =DEFAULT_CAPACITY;
    }
    public void add(String string){
        if (size == capacity) {
            String[] newStrings = new String[capacity * 2];
            capacity *= 2;
            for (String s : strings) {

            }
            strings = newStrings;
        }
    }
}
