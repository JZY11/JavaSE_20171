package java1702.javase.generic;

import java.util.Vector;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/13.
 * JavaSE_20171.
 */
public class VectorTest {
    public static void main(String[] args) {
//        Vector vector = new Vector();
//        vector.add("abc");
//        vector.add("123");
//        vector.add(true);
//        vector.add(456);
//        String s = (String) vector.get(3);// 编译不报错运行报错(整型不能强转为字符串)
//        System.out.println(s);
//        System.out.println(vector.get(3));

        Vector<String> vector = new Vector<>();
        vector.add("abc");// 定义了泛型之后，类型安全  若添加的不属于定义的泛型，则会类型检查报错
        vector.add("123");// 避免类型转换时报错并去除了类型转换，还可简化代码
        vector.add("true");
        System.out.println(vector.get(2));
    }
}
