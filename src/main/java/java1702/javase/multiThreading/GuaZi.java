package java1702.javase.multiThreading;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/9.
 * JavaSE_20171.
 */
public class GuaZi {
    public static void main(String[] args) throws IOException {
        String url = "https://www.guazi.com/bj/benz/";
        Document document = Jsoup.connect(url).get();
//        Elements elements = document.select()
    }
}
