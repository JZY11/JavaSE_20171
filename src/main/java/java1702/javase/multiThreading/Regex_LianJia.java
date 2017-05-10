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
            提取需要的东西(如：图片，单价，总价...)做成正则
 */
public class Regex_LianJia {
    private static final String DONGCHENG_URL = "http://bj.lianjia.com/ershoufang/dongcheng/";
    private static final String IMAGE_REGEXP = "http://[a-z0-9./:-]+232x174\\.jpg";

    public static void main(String[] args) {
        try {
            URL url = new URL(DONGCHENG_URL);
            //读取网页源代码，分析含有图片链接的字符串截取出来下载
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String line;//定义当前网页源代码的每一行
                int counter = 0;
                Pattern pattern = Pattern.compile(IMAGE_REGEXP);//定义模式，括号里放入正则
                Matcher matcher = null;//定义Matcher
                while ((line = bufferedReader.readLine()) != null) {
                    if (line.contains("data-original")) {
                        matcher = pattern.matcher(line);//用这每一行与特定的模式(正则)比较
                        while (matcher.find()) {// 若发现与模式匹配的行，下面一行输出
                            System.out.println(matcher.group());
                            counter++;
                        }
//                        System.out.println(line);
                    }
                    System.out.println(line);//输出网页源代码
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {


        }
    }
}
