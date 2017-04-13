package java1702.javase.e;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/12.
 * JavaSE_20171.
 */
/*
    使用 Map 接口的实现类完成员工工资(姓名→工资)的摸拟：
    添加几条信息
    列出所有的员工姓名
    列出所有员工姓名及其工资
    删除名叫 Tom 的员工信息
    输出 Jack 的工资，并将其工资改为 1500 元
    将所有工资低于 1000 元的员工的工资上涨 20%
 */
public class JiHe_E2 {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("Tom", 3000d);
        map.put("Jack", 2500d);
        map.put("Tony", 900d);
        for (String s : map.keySet()) {
            System.out.println(s);
        }
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
        map.remove("Tom");
        System.out.println(map);
        map.put("Jack", 1500d);
        System.out.println(map.get("Jack"));
        for (String s : map.keySet()) {
            if (map.get(s) < 1000){
                map.put(s, map.get(s) * 1.2);// !!
            }
        }
        System.out.println(map);
    }
}
