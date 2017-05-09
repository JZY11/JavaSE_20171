package java1702.javase.multiThreading;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/9.
 * JavaSE_20171.
 */
/*
       利用JSoup来完成链家数据的获取:(1)加载JSoup类库支持 (2)做一个取得整个页面的文档(Document),获得整个页面的源代码
                                     用JSoup的静态方法JSoup.connect(url).get()   String url =http://bj.lianjia.com/ershoufang/dongcheng
       若网站禁止访问(IP地址呗封)后可通过:开启cookie支持的方法，如：JSoup.connect(url).cookie("lianjia_uuid", "5a83ce81-c81e-47ec-b412-e4b6ffba4151")
       打开网页源码，在network中的头部信息(Header)中找到Cookie(键，值组成)中的信息，调用cookie方法cookie("lianjia_uuid", "5a83ce81-c81e-47ec-b412-e4b6ffba4151")
       就又可访问
       document.select()：括号里放入的是字符串(css的选择器)，如："li[class = clear]"
       element.select(): 返回的为elements
       element.select("a[data-el = region]").first()：返回一个字符串
       element.select("a[data-el = region]").first().text()：返回一个去掉标签属性的文本
       只要浏览器能访问的话，代码里都可以做的到
 */
public class Spider {
    private static final String url = "http://bj.lianjia.com/ershoufang/dongcheng/pg";
    private static int counter;

    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect(url).cookie("lianjia_uuid", "5a83ce81-c81e-47ec-b412-e4b6ffba4151").get();
        int total = Integer.parseInt(document.select("h2[class=total fl]").first().child(0).text());
        int pages = (int) Math.ceil(total / 30d);//??
        for (int i = 0; i < pages; i++) {
            System.out.println("page:" + (i + 1));
            page(i + 1);
        }
    }

//扩大一级循环只是一个地区，一个地区是多页的先将内层循环扩大一倍，变成一个以前说过page方法，参数接受一个page,url地址要改加上/pg
//作为一个常量，再做一个主方法，在里面做一个fori循环，循环全部的页数，页数有问题，重新定义下，再获取下(*)：共找到1058套北京二手房
//


    private static void page(int page) {//public static void main(String[] args):只是一页的
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data/test", true))) {
            Document document = Jsoup.connect(url + page).cookie("lianjia_uuid", "5a83ce81-c81e-47ec-b412-e4b6ffba4151").get();
//            int pages = Integer.parseInt(document.select("h2[class=total fl]").first().child(0).text())/30;//(*)
            Elements elements = document.select("li[class = clear]");// 得到每个li(每一套房子的信息)
            for (Element element : elements) {
                String region = element.select("a[data-el = region]").first().text();
//            System.out.println(region);
//            String totalPrice = element.select("div[class = totalPrice]").first().text();
                String totalPrice = element.select("div[class = totalPrice]").first().child(0).text();
                //totalPrice复数下的第一个(first() )下的子属性child(),而child(0)表示第一个属性，child(0).text()表示去掉标签属性的文本即可去掉万

//            String houseInfo = element.select("div[class = houseInfo]").first().text();
                Element houseInfoElement = element.select("div[class=houseInfo]").first();
                String houseInfo = "";
                for (Node node : houseInfoElement.childNodes()) {
                    if (node instanceof TextNode) {
                        houseInfo = node.toString();
                    }
                }
                String unitPrice = element.select("div[class = unitPrice]").first().attr("data-price");
                writer.write(region + "@" + houseInfo + "@" + totalPrice + "@" + unitPrice + "\n");
                System.out.println("\t" + "counter:" + ++counter);
//        System.out.println(document);//得到整个页面文档(Html)
//                System.out.println(elements.size());
//            System.out.println(link);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
