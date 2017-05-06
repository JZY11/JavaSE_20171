package java1702.javase.reflect.demo.c;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/5.
 * JavaSE_20171.
 */
/*
       Properties类的作用是：读取一些设置文件(Key, Value)
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        //让类Properties与文件config.properties产生关联，将文件读入输入流
        properties.load(new FileReader("src/main/java/java1702/javase/reflect/demo/c/config.properties"));
        System.out.println(properties.getProperty("key"));
        System.out.println(properties.getProperty("k"));


    }

}
