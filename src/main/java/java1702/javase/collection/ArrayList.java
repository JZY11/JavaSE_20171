package java1702.javase.collection;

import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/31.
 * JavaSE_20171.
 */
public class ArrayList {
    public static void main(String[] args) {
        List<String> strings = new java.util.ArrayList<>();
        strings.add("hello");
        strings.add("hi");
        strings.add("hey");
        for (String string : strings) {//遍历输出
            System.out.println(string);
        }
        System.out.println(strings.size());
        System.out.println(strings.get(2));
        System.out.println(strings.remove(1));//remove有返回值
        System.out.println(strings.contains("hey"));
        System.out.println(strings.set(1,"helloworld"));//返回的为修改之前的元素内容(修改后的显示不出来)
    }
}
