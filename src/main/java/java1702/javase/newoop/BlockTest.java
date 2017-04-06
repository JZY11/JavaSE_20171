package java1702.javase.newoop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/6.
 * JavaSE_20171.
 */
public class BlockTest {
    public static void main(String[] args) {
        {//开始定义代码块
            int a;//定义一个代码块局部变量a
          //  System.out.println("代码块变量a的值:" + a);// 报错  因为变量a还未赋值
            a = 5;
            System.out.println("代码块变量a的值:" + a);
        }
        //System.out.println("代码块变量a的值:" + a); 报错   因为除了代码块的作用域  出了代码块变量a立即被销毁
    }
}
class MethodLocalVariableTest{
    public static void main(String[] args) {
        int a; // 定义一个局部变量
        //System.out.println("方法局部变量a的值：" + a);//报错 变量a还没有初始化
        a = 5;
        System.out.println("方法局部变量a的值：" + a);
    }
}
class VariableOverrideTest{
    private String name = "Tom";//定义一个name实例变量
    private static double price = 78.0; //定义一个price类变量
    public static void main(String[] args) {
        int price = 65;//定义一个方法里的局部变量，局部变量覆盖成员变量
        System.out.println(price);//直接访问price变量，将输出price局部变量的值：65
        System.out.println(VariableOverrideTest.price);//使用类名作为price变量的限定
    }
}