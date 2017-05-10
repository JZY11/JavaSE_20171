package java1702.javase.multiThreading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Pattern;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/10.
 * JavaSE_20171.
 */
public class Regex_LianJia {
    private static final String DONGCHENG_URL = "http://bj.lianjia.com/ershoufang/dongcheng/";
    private static final String IMAGE_REGEXP ="^http.*jps$";

    public static void main(String[] args) {
        try {
            URL url = new URL(DONGCHENG_URL);
            //读取网页源代码，分析含有图片链接的字符串截取出来下载
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String line;//定义当前网页源代码的每一行
                int counter = 0;
                Pattern pattern = Pattern.compile(IMAGE_REGEXP);//定义模式
                while ((line = bufferedReader.readLine()) != null){
                    System.out.println(line);//输出网页源代码
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {


        }
    }
}
