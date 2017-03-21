package java1702.javase.e;

import sun.text.resources.cldr.ia.FormatData_ia;

import java.util.Random;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/20.
 * JavaSE_20171.
 */
/*
* 34. 随机生成[1， 20]数10000次，使用两种方法实现（ java.lang.Math，
     java.util.Random） ，并判断两种方法的效率和分布。
 */
//  import java.util.Random;
    //util - utility 实用工具
public class E34 {
    public static void main(String[] args) {
        Random random = new Random();//(2):需要先创建实例对象不是java.lang这一包
        for (int i = 0; i < 10000; i++) {
            int r = random.nextInt(20);//(2):
//            int r = (int) (Math.random() * 20) + 1;// (1):调用Math数学方法  可直接调用因为是java语言包(唯一的使用其内容不需要导包)
//            System.out.println(r);//(1):
//            System.out.println(random.nextInt());
            System.out.println(r);//(2):
        }
    }
}
