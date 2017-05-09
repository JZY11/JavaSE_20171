package java1702.javase.multiThreading;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.w3c.dom.css.Counter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/9.
 * JavaSE_20171.
 */
public class GuaZi {
    private static final String URL = "https://www.guazi.com/bj/benz/o";
    private static int counter;

    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect(URL).get();
        for (int i = 0; i < 8; i++) {
            System.out.println("page:" + (i + 1));
            page(i + 1);
        }
    }

    private static void page(int page) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data/guazi",true))) {

            Document document = Jsoup.connect(URL + page).get();
            Elements elements = document.select("div[class = list-infoBox]");
            for (Element element : elements) {
                String type = element.select("p[class = infoBox]").first().text();
                String money = element.select("i[class = fc-org priType]").first().text();
                String tl = element.select("p[class = fc-gray]").first().text();
//                System.out.println("车型：" + type + "；价钱：" + money + "；上牌时间及行驶距离：" + tl);
                writer.write(type + "@" + money + "@" + tl + "\n");
                System.out.println("\t" + "counter:" + ++counter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
