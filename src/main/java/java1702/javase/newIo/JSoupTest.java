package java1702.javase.newIo;

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
//        System.out.println(document);// 打印网页源代码
//        System.out.println(document.text());// 打印网页上所有的文本内容


        // 以下为获得图片的链接地址
        Elements elements = document.select("img[class=lazy]");//cssQuery里可放入各种各样的选择器
        System.out.println(elements.size());
        for (Element element : elements) {
            System.out.println("http:" + element.attr("data-original"));//attr(attribute)返回属性值
        }
    }
}
