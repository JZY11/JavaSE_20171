package java1702.javase.newoop;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/11.
 * JavaSE_20171.
 */
/*
       构建一个ArrayList实例时，要预先估计好容器里大概要放多少个元素，尽量不调用默认的
       无参构造方法，因为初始容量太小只有10，可调用有一个实际值的如1000个，
       若将来感觉估计的1000不太好的话，还可通过ensureCapacity()方法来进行修改，以保证容量足够的答
       来覆盖当前所有的容量，效率会比较高
 */
public class EnsureCapacityTest {
    private static final int N = 10000000;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ArrayList<String> strings = new ArrayList<>();//若没有下一行代码，则初始容量为10
        //当加入的元素个数超过10个时就要扩容，所以运行时间会长些
        strings.add("");//??
        System.out.println("c1：" + getCapacity(strings));
        strings.ensureCapacity(N);
        System.out.println("c2：" + getCapacity(strings));
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
