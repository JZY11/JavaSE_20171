package java1702.javase.multiThreading;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/9.
 * JavaSE_20171.
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("http://bj.lianjia.com/ershoufang/").cookie("lianjia_uuid", "5a83ce81-c81e-47ec-b412-e4b6ffba4151").get();
        Elements elements = document.select("div[data-role=ershoufang]").first().select("a[href^=/ershoufang]");
        for (Element element : elements) {
            System.out.println(element.attr("href"));//输出18个地区的链接地址
        }
    }
}
