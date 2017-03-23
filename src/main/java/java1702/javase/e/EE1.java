package java1702.javase.e;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/22.
 * JavaSE_20171.
 */
/*
*  猜数字游戏，用户不停的猜，直到猜对了为止  （递归调用）
*  AI(人工智能)
 */
public class EE1 {
    private static int x;
    private static int counter;
    public static void main(String[] args) {
        Random random = new Random();
        x = random.nextInt();
        guess();//静态方法可直接调用
    }
    private static void guess(){
        System.out.println("请输入一个数");
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();//调用scanner来接受这个数
        if (y > x) {
            System.out.println("大了");
            counter++;//用到了递归
            guess();//大了后再次调用该方法
        } else if (y < x){
            System.out.println("小了");
            counter++;
            guess();//小了继续调用
        }else if (y == x){
            System.out.println("猜对了");//猜对了需要统计一共猜了多少次需要再定义一个变量
            counter++;
            System.out.println(counter);
//            return;//不需要再猜了 退出该方法
        }else{
            System.out.println("errorr");
        }
        //三目运算符不能写一些语句也不能调用，只是要得到一个运算结果 所以三目运算符做不了该题
    }
}
