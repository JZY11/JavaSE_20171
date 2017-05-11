package java1702.javase.multiThreading;

import java.io.*;
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
        (1):dongcheng后加pg,(2):主方法改为getPage(),(3):在主方法里做一所有页数的循环,(4):DONGCHENG_URL + page
        (5):counter定为静态的域

        更大的循环(北京所有的地区)，需要定义两个常量AREA ,PAGES,  主方法中外层循环每执行一次下载一个区的
        内层循环每执行一次下载每个区的每一页的

        new InputStreamReader(url.openStream())：中url.openStream()返回InputStream字节流
                                                  new InputStreamReader(url.openStream())将字节流转化为字符流
                                                  起到了字节流与字符流之间
                                                  new InputStreamReader()里的参数为一字节流，，  InputStreamReader为Reader的子类
                                                  OutputStreamWriter:将输出的字节流转化为字符流
 */
public class Regex_LianJia_TotalPageSource {
    private static final String[] AREA = {
            "dongcheng",
            "xicheng",
            "chaoyang",
            "haidian",
            "fengtai",
            "shijingshan",
            "tongzhou",
            "changping",
            "daxing",
            "yizhuangkaifaqu",
            "shunyi",
            "fangshan",
            "mentougou",
            "pinggu",
            "huairou",
            "miyun",
            "yanqing",
            "yanjiao"
    };
    private static final Integer[] PAGES = {
            35,
            39,
            100,
            100,
            73,
            22,
            47,
            95,
            43,
            7,
            30,
            20,
            15,
            1,
            0,
            1,
            1,
            98
    };
    private static final String DONGCHENG_URL = "http://bj.lianjia.com/ershoufang/";
    private static final String IMAGE_REGEXP = "<div class=\"totalPrice><span>(\\d+)</span>";
    private static int counter;

    //匹配数字的正则[0-9]或\\d表单个(\\d+表至少一个)
    public static void main(String[] args) {
        for (int i = 0; i < AREA.length; i++) {
            counter = 0;//每下载完一个区后归0
            System.out.println(AREA[i]);
            for (int j = 0; j < PAGES[i]; j++) {
                getPage(j + 1, AREA[i]);
            }

        }
    }

    public static void getPage(int page, String area) {
        try {
            URL url = new URL(DONGCHENG_URL + area + "/pg" + page);// 循环下来后所有房子的总价就都有了
            //读取网页源代码，分析含有图片链接的字符串截取出来下载
            try (
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data1/area"))
            ) {

                String line;//定义当前网页源代码的每一行
                Pattern pattern = Pattern.compile(IMAGE_REGEXP);//定义模式，括号里放入正则
                Matcher matcher;
                while ((line = bufferedReader.readLine()) != null) {
                    matcher = pattern.matcher(line);//用这每一行与特定的模式(正则)比较
                    while (matcher.find()) {// 若发现与模式匹配的行，下面一行输出
                        bufferedWriter.write(matcher.group(1) + "\n");
                        System.out.println(++counter);
                        // group()的另一个重载方法group(1)，只需要(\\d+)表正则里带第一个小括号的
                        // 只输出正则中匹配的数字即数据的取得
                        counter++;
                    }
//                        System.out.println(line);

//                    System.out.println(line);//输出网页源代码
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {


        }
    }
}
