package java1702.javase.io;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/8.
 * JavaSE_20171.
 */
public class JSoupTest {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("http://jandan.net/tag/nasa").get();
//        System.out.println(document.text());
        Elements elements = document.select("img[class=lazy]");
        System.out.println(elements.size());
        for (Element element : elements) {
            System.out.println("http:" + element.attr("data-original"));
        }
    }
}
