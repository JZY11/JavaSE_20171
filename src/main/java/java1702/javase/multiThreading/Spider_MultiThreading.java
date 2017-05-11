package java1702.javase.multiThreading;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.SocketTimeoutException;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/11.
 * JavaSE_20171.
 */
/*
       利用URL获得所有地区的网址
 */
public class Spider_MultiThreading implements Runnable {

//    private static final String[] CITIES = {"bj", "tj"};

    private static final String URL = "http://bj.lianjia.com/ershoufang/";
    private static final String UUID_KEY = "lianjia_uuid";
    private static final String UUID_VALUE = "5a83ce81-c81e-47ec-b412-e4b6ffba4151";
    private String areaName;


    public Spider_MultiThreading(String areaName) {
        this.areaName = areaName;
    }

    public static void main(String[] args) throws IOException {
        //获得网址(URL)的文档对象
        Document document = Jsoup.connect(URL).cookie(UUID_KEY, UUID_VALUE).get();
        //查找一个css选择器:"div[data-role = ershoufang]".first()   select()返回是elements， 加first()返回element
        Elements elements = document.select("div[data-role = ershoufang]").first().select("a");
        for (Element element : elements) {
            // element.attr():取得某一个属性对应的值即带有ershoufang的链接地址，采用替换(replaceAll方法去除ershoufang)
            // 得到每个地区的名字areaName(名字的全拼写)
            String areaName = element.attr("href").replaceAll("(ershoufang|/)", "");
            Thread thread = new Thread(new Spider_MultiThreading(areaName));
            thread.start();
        }
    }

    @Override
    public void run() {
        try {
            // timeout(0)：将超时时间设置为0就不会报超时     运行时有些超时错误(获取页面是时候反应时间太长了，超出了一个固定是时间报的异常)
            Document areaDocument = Jsoup.connect(URL.concat(areaName)).timeout(0).cookie(UUID_KEY, UUID_VALUE).get();
            // 获得某个地区房间的总数量                          [class*=total]：表示属性包含total   第一个子元素的文本
            int totalHouses = Integer.parseInt(areaDocument.select("h2[class*=total]").first().child(0).text());
            // 获得一个地区的总页数
            int pages = (int) Math.ceil(totalHouses / 30d);
            for (int i = 0; i < pages; i++) {//对页数进行循环
                page(areaName, i + 1);//对每一页调用page()方法
                System.out.println(areaName + "\t\tpage: " + (i + 1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void page(String areaName, int page) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data/bj/" + areaName, true))) {
            Document document = Jsoup.connect(URL.concat(areaName) + "/pg" + page).cookie("lianjia_uuid", "fe547e4f-b83f-49be-9708-5af2d41ebef4").get();
            Elements elements = document.select("li[class=clear]");
            for (Element element : elements) {
                //childNode(0)表示"li[class=clear]"下的第一个子节点
                String imageUrl = element.childNode(0).attr("href");
                // 图片id：用图片链接地址截取，即字符串截取
                String id = imageUrl.substring(imageUrl.lastIndexOf("/") + 1, imageUrl.lastIndexOf("."));
                String region = element.select("a[data-el=region]").first().text();
                String totalPrice = element.select("div[class=totalPrice]").first().child(0).text();
                Element houseInfoElement = element.select("div[class=houseInfo]").first();
                String houseInfo = houseInfoElement.childNode(2).toString();
                String unitPrice = element.select("div[class=unitPrice]").first().attr("data-price");
                writer.write(id + "@" + region + "@" + houseInfo + "@" + totalPrice + "@" + unitPrice + "\n");
            }
        } catch (SocketTimeoutException e) {
            System.out.println("---socket time out: " + areaName + ", page: " + page);
            page(areaName, page);
        } catch (HttpStatusException e) {
            System.out.println("---http status code: " + areaName + ", page: " + page);
            page(areaName, page);
        } catch (IOException e) {
            System.out.println("---io exception: " + areaName + ",page: " + page);

            page(areaName, page);
        }
    }
}
