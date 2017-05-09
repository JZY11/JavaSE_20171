package java1702.javase.multiThreading;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/9.
 * JavaSE_20171.
 */
public class Spider {
    public static void main(String[] args) throws IOException {
        String url = "http://bj.lianjia.com/ershoufang/dongcheng/";
        Document document = Jsoup.connect(url).cookie("lianjia_uuid", "5a83ce81-c81e-47ec-b412-e4b6ffba4151").get();
//        System.out.println(document);//得到整个页面文档(Html)
        Elements elements = document.select("li[class = clear]");// 得到每个li(每一套房子的信息)
        System.out.println(elements.size());
        for (Element element : elements) {
            String region = element.select("a[data-el = region]").first().text();
//            System.out.println(region);
//            String totalPrice = element.select("div[class = totalPrice]").first().text();
            String totalPrice = element.select("div[class = totalPrice]").first().child(0).text();
//            String houseInfo = element.select("div[class = houseInfo]").first().text();
            Element houseInfoElement = element.select("div[class=houseInfo]").first();
            String houseInfo = "";
            for (Node node : houseInfoElement.childNodes()) {
                if (node instanceof TextNode) {
                    houseInfo = node.toString();
                }
                String unitPrice = element.select("div[class = unitPrice]").first().text();
                String link = element.select("a[class = img]").first().absUrl("href");
//            System.out.println(link);
                System.out.println("小区：" + region + "户型：" + houseInfo + "总价:" + totalPrice + "单价:" + unitPrice + "房子链接:" + link);
            }
        }
    }
}
