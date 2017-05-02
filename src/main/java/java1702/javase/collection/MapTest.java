package java1702.javase.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/2.
 * JavaSE_20171.
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("疯狂Java讲义", 109);
        map.put("疯狂ios讲义", 10);
        map.put("疯狂Ajax讲义", 79);
        map.put("轻量级Java EE企业应用实战", 99);
        System.out.println(map);
        System.out.println("---------");
        System.out.println(map.put("疯狂ios讲义", 99));// 输出10
        System.out.println("疯狂ios讲义 key：" + map.containsKey("疯狂ios讲义"));
        System.out.println("是否包含值为99 value：" + map.containsValue(99));
        System.out.println("===============");
        for (String key : map.keySet()) {
            //map.get(key)方法获取指定key对应的value
            System.out.println(key + "-->" + map.get(key));
        }
        System.out.println("->->->->->->");
        map.remove("疯狂/Ajax讲义");// 根据key来删除key-value对
        System.out.println(map);
    }
}
