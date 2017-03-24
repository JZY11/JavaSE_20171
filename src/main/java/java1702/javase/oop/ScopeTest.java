package java1702.javase.oop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/24.
 * JavaSE_20171.
 */
/*
*块block作用范围(1)从变量声明之处到当前快结束之处（2）方法中的局部变量local variable,方法的参数，循环的变量
* 方法内的局部变量可以覆盖同名的域
 */
public class ScopeTest {//类作用的范围   类的域和方法
    public void method(){
        i = 0;
        int j = 1;//在方法内  被称为局部变量
        System.out.println(j);
        for (int k = 0; k < 10; k++) {
            j = 2;
            System.out.println(j);
//            for (int k = 0; k < 5; k++) {
//            }
        }
        for (int k = 0; k < 10; k++) {

        }
    }
    private int i;
}
