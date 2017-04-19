package java1702.javase.exception;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/17.
 * JavaSE_20171.
 */
/*
 try内一旦发生异常，try内这条语句后的代码都不再执行，无论异常有没有被捕获(catch)
 但不影响catch后的语句(若没有异常)

 输出异常信息：e.printStackTrace()
 退出程序：System.exit(1)
  */
public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("hello".charAt(5));// StringIndexOutOfBoundsException
            System.out.println((new int[]{1, 2, 3})[1]);// ArrayIndexOutOfBoundsException
            System.out.println(1 / 0);// ArithmeticException
            System.out.println(Integer.valueOf("l23"));// NumberFormatException
            String s = "hi";
            s = null;
            System.out.println(s.toUpperCase());//  NullPointerException
        } catch (StringIndexOutOfBoundsException e) {
        }finally {// finally不管异常有没有被捕获总能被执行(善后工作)
            System.out.println("test...");
        }
        System.out.println("test...");
    }
}
