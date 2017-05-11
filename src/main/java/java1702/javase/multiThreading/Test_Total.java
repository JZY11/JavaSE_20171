package java1702.javase.multiThreading;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/11.
 * JavaSE_20171.
 */
/*
     取出所有的城区数组
 */
public class Test_Total {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("http://bj.lianjia.com/ershoufang/").cookie("lianjia_uuid", "5a83ce81-c81e-47ec-b412-e4b6ffba4151").get();
//        System.out.println(document);
        //css的派生选择器
        System.out.print("[");
        for (Element element : document.select("div[data-role] a[href*=ershoufang]")) {
            System.out.print("'" + element.text() + "',");
        }
        System.out.print("]");


        System.out.println("--");

        //获取所有区域的全拼
        for (Element element : document.select("div[data-role] a[href*=ershoufang]")) {
            System.out.println(element.attr("href").replaceAll("(ershoufang|/)",""));
        }
    }
}
