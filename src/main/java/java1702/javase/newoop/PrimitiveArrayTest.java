package java1702.javase.newoop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/7.
 * JavaSE_20171.
 */
public class PrimitiveArrayTest {//(一) 基本类型数组的初始化
    public static void main(String[] args) {
        int[] iArr;//定义一个int[]类型的数组变量
        iArr = new int[5];//动态初始化数组，数组长度为5
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = i + 10;// 采用循环方式为每个数组元素赋值
        System.out.println(iArr[i]);
        }
    }
}

class Person{
    public int age;
    public double height;
    public void info(){
        System.out.println("我的年龄是：" + age + ",我的身高是：" + height);
    }
}
class  ReferenceArrayTest{// (二)引用数组的初始化的典型过程
    public static void main(String[] args) {
        Person[] students = new Person[2];//动态初始化
        Person zhang = new Person();
        zhang.age = 15;
        zhang.height = 158;
        Person lee = new Person();
        lee.age = 16;
        lee.height = 161;
        students[0] = zhang;//将zhang的变量的值赋给第一个数组元素
        students[1] = lee;//将lee的变量的值赋给第er个数组元素
        lee.info();
        students[1].info();
    }
}
