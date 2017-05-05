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
            Class clazz = Class.forName(className);//根据类名创建类对象
            Method method = clazz.getDeclaredMethod(methodName);//根据方法名称创建方法对象
            Constructor constructor = clazz.getDeclaredConstructor();//创建构造器对象
            method.invoke(constructor.newInstance());//根据构造器对象的newInstance()方法来实例object对象
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
