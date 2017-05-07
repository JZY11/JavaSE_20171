package java1702.javase.newoop;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/11.
 * JavaSE_20171.
 */
public class EnsureCapacityTest {
    private static final int N = 10000000;
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();//若没有下一行代码，则初始容量为10
                                                      //当加入的元素个数超过10个时就要扩容，所以运行时间会长些
        strings.ensureCapacity(N);
        Long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            strings.add("Hello");
        }
        System.out.println(System.currentTimeMillis() - start);
    }
    private static int getCapacity(ArrayList<String> strings) throws NoSuchFieldException, IllegalAccessException {
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        return ((Object[]) field.get(strings)).length;
    }
}
