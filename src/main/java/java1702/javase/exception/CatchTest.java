package java1702.javase.exception;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/17.
 * JavaSE_20171.
 */
/*
   Exception in thread "main"表异常未被捕获
   异常捕获类型范围不能定义的太大，目的是为了更精确的刷选出来做更积极的处理
 */
public class CatchTest {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (StringIndexOutOfBoundsException e) { //Exception e(自动显示的)   ArithmeticException e
            e.printStackTrace();
        }
        System.err.println("算数异常...");
    }
}
