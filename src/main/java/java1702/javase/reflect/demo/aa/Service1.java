package java1702.javase.reflect.demo.aa;

import java.io.File;
import java.io.FileInputStream;
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
/*
       使用这个例子，可以较好得理解反射的一个应用场景。
       这也是Spring框架的最基本的原理，只是它做的更丰富，安全，健壮。
 */
// 步骤1：业务类
public class Service1 {
    public void doService1(){
        System.out.println("业务方法1");
    }
}


// 步骤2：非反射方式
class Test{
    public static void main(String[] args) {
        new Service1().doService1();
    }
}



// 步骤3：反射方式
class Test1{
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //从spring.txt中获取类名称和方法名称
        File springConfigFile = new File("src/main/java/java1702/javase/reflect/demo/aa/spring.txt");
        Properties springConfig = new Properties();
        springConfig.load(new FileInputStream(springConfigFile));
        String className = (String) springConfig.get("class");
        String methodName = (String) springConfig.get("method");

        //根据类名称创建类对象
        Class clazz = Class.forName(className);

        //根据方法名称，获取方法
        Method m = clazz.getMethod(methodName);

        //获取构造器
        Constructor c = clazz.getConstructor();

        //根据构造器，实例化出对象
        Object service = c.newInstance();

        //调用对象的指定方法
        System.out.println("-------------");
        m.invoke(service);

    }
}