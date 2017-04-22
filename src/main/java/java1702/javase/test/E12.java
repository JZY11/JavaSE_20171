package java1702.javase.test;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/22.
 * JavaSE_20171.
 */
/*
     编写一个正确处理的产生空指针异常的程序
 */
public class E12 {
    public static void main(String[] args) {
        String s = null;
        try{
            System.out.println(s.charAt(3));
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
