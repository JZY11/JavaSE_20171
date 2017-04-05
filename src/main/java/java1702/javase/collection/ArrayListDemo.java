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
       //(二)： 删除对象示例
class ArrayListDemo1{
    public static void main(String[] args) {
        List<String> allList = new ArrayList<>();
        Collection<String> allCollection = new ArrayList<>();
        allList.add("Hello");
        allList.add(0, "World");
        allList.add("MLDN");
        allList.add("www.mldn.cn");
//        allList.remove(0);
//        allList.remove("Hello");
        System.out.println(allList);
    }
}
        //(三)输出全部元素
class ArrayListDemo2{
    public static void main(String[] args) {
        List<String> allList = new ArrayList<>();
        allList.add("Hello");
        allList.add("Hello");// list中的内容可重复
        allList.add(0, "World");
        allList.add("MLDN");
        allList.add("www.mldn.cn");
        System.out.print("由前向后输出：");// 信息输出
        for (int i = 0; i < allList.size(); i++) {// 循环输出集合内容
            System.out.print(allList.get(i) + " 、");//  通过索引来取得集合中的元素
        }
        System.out.print("\n由后向前输出：");
        for (int i = allList.size() - 1; i >= 0 ; i--) {
            System.out.print(allList.get(i) + " 、");
        }
    }//   在List集合中数据增加的顺序就是输出后的顺序
}
      //(四)将集合变为对象数组
class ArrayListDemo3{
    public static void main(String[] args) {
        List<String> allList = new ArrayList<>();
        allList.add("Hello");
        allList.add(0, "World");
        allList.add("MLDN");
        allList.add("www.mldn.cn");
        String[] str = allList.toArray(new String[]{});// 指定的泛型类型  allList只包含字符串的一个已知列表。以下代码用来将该列表转储到一个新分配的 String 数组：
        System.out.print("指定数组类型：");//new String[]{}定义了一个空字符串数组，在allList.toArray(new String[]{})中，是告诉编译器，返回的结果是一个字符串数组。
        for (int i = 0; i < str.length; i++) {// 输出字符串数组中的内容
            System.out.print(str[i] + " 、");
        }
        System.out.print("\n返回对象数组：");
        Object[] obj = allList.toArray();//直接返回对象数组
        for (int i = 0; i < obj.length; i++) {
            String temp = (String) obj[i];
            System.out.print(temp + " 、");
        }
    }
}
     //(五)测试其他操作
class ArrayListDemo4{
    public static void main(String[] args) {
        List<String> allList = new ArrayList<>();
        System.out.println("集合操作前是否为空？" + allList.isEmpty());
        allList.add("Hello");
        allList.add(0, "World");
        allList.add("MLDN");
        allList.add("www.mldn.cn");
        System.out.println(allList.contains("Hello") );
        System.out.println("MLDN字符串的位置：" + allList.indexOf("MLDN"));
        System.out.println("集合操作后是否为空？" + allList.isEmpty());
    }
}