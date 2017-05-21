package java1702.javase.baidu;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/14.
 * JavaSE_20171.
 */
public class Main {
    public static final String URL = "http://baidu.com";

    public static void main(String[] args) {
//        String url = "http://www.baidu.com";
//        String result = "";
//        BufferedReader in = null;
//        try {
//            URL realUrl = new URL(url);
//            URLConnection connection = realUrl.openConnection();
//            connection.connect();
//            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            String line;
//            while ((line = in.readLine()) != null){
//                result += line + "\n";
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(result);
        try {
            Document document = Jsoup.connect(URL).get();
//            System.out.println(document);
            Elements elements = document.select("div[id = lg]").first().select("img[id = s_lg_img]");
            for (Element element : elements) {
//                String pName = element.attr("src");
//                System.out.println(pName);
                System.out.println(element);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
