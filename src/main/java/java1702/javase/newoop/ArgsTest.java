package java1702.javase.newoop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/9.
 * JavaSE_20171.
 */
public class ArgsTest {
    public static void main(String[] args) {
        System.out.println(args.length);//输出args数组的长度
        for (String arg : args) {// 遍历每rgs数组的每个元素
            System.out.println(arg);
        }
    }
}
