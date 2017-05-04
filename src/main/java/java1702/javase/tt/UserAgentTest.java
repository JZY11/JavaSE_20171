package java1702.javase.tt;

import java.io.IOException;
import java.net.URL;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/4.
 * JavaSE_20171.
 */
public class UserAgentTest {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://wallpapers.wallhaven.cc/wallpapers/full/wallhaven-325237.jpg");
        System.out.println(url.openStream().available());//图片数据流的长度
    }
}
