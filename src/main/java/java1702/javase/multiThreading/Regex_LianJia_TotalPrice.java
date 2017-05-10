package java1702.javase.multiThreading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/10.
 * JavaSE_20171.
 */
/*
        因没有学到数据库，暂时将获取到的数据储存在一个文件中，同样是永久保存，先做一个大的循环来保存所有页的数据
        dongcheng后加pg,主方法改为page()
 */
public class Regex_LianJia_TotalPrice {
    private static final String DONGCHENG_URL = "http://bj.lianjia.com/ershoufang/dongcheng/pg";
    private static final String IMAGE_REGEXP = "<div class=\"totalPrice><span>\\d+</span>";
    //匹配数字的正则[0-9]或\\d表单个(\\d+表至少一个)

    public static void main(String[] args) {
        try {
            URL url = new URL(DONGCHENG_URL);
            //读取网页源代码，分析含有图片链接的字符串截取出来下载
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String line;//定义当前网页源代码的每一行
                int counter = 0;
                Pattern pattern = Pattern.compile(IMAGE_REGEXP);//定义模式，括号里放入正则
                Matcher matcher;
                while ((line = bufferedReader.readLine()) != null) {
                    matcher = pattern.matcher(line);//用这每一行与特定的模式(正则)比较
                    while (matcher.find()) {// 若发现与模式匹配的行，下面一行输出
                        System.out.println(matcher.group(1));
                        // group()的另一个重载方法group(1)，只需要(\\d+)表正则里带第一个小括号的
                        // 只输出正则中匹配的数字即数据的取得
                        counter++;
                    }
//                        System.out.println(line);

//                    System.out.println(line);//输出网页源代码
                }
                System.out.println(counter);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {


        }
    }
}

