package java1702.javase.reflect.demo.c;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/5.
 * JavaSE_20171.
 */
public class Service {
    public void write() throws IOException {
        //1  load文件
        Properties properties = new Properties();
        properties.load(new FileReader("src/main/java/java1702/javase/reflect/demo/c/config.properties"));
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");
//        System.out.println("className" + "methodName");


        //2 取得对象
        try {
            Class clazz = Class.forName(className);
            Method method = clazz.getDeclaredMethod(methodName);
            Constructor constructor = clazz.getDeclaredConstructor();
            method.invoke(constructor.newInstance());
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
