package java1702.javase.reflect;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/3.
 * JavaSE_20171.
 */
/*
     反射   与域有关
     因为Parameter这个类起始于JDK1.8 所以代码编译级别要是1.8，而我们当前用的API文档为1.6
     具体看1：项目的配置即API级别看的就是SDK default
           2：模块(Modules)也要是8
           3：修改build.gradle文件
           4：修改完后要同步下gradle，View->Tool Windows->Gradle
 */
class Animals{
    public int age;
    private double weight;

    public Animals() {//无参构造方法
    }

    public Animals(int age, double weight) {//含有全部参数的有参构造方法
        this.age = age;
        this.weight = weight;
    }
    public int sleep(int hours){
        return hours;
    }
    public void eat(String food){
        System.out.println("eating" + food);
    }
    private void killHuman(){
        System.out.println("killed a poor guy...");
    }
    // getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
public class Human extends Animals{
    public String name;
    private boolean married;

    public Human() {
    }

    public Human(int age, double weight, String name, boolean married) {
        super(age, weight);// 调用父类的有参构造方法
        this.name = name;
        this.married = married;
    }

    @Override
    public void eat(String food) {
        System.out.println(name + "is now eating" + food);
    }
    public void study(String course){
        System.out.println(name + "is now studying" + course);
    }
    private void killAnimals(String animal){
        System.out.println(name + "is now killing" + animal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married)  {
        this.married = married;
    }
}
class HumanTest{
//    public static void main(String[] args) {
//        Human human = new Human();
//        Class clazz = human.getClass();// 可根据Class类的对象clazz,来获取一些类的信息
//        Field[] fields = clazz.getFields();//java.lang的Class类的实例clazz调用java.lang.reflect的getFields()方法
                                             //返回Fields[]
//        System.out.println("---getFields()---");
//        for (Field field : fields) {// 进行迭代
//            System.out.println(field.getName());
//        }
//        Field[] declaredFields = clazz.getDeclaredFields();//declared:声明
//        System.out.println("---getDeclaredFields()---");
//        for (Field declaredField : declaredFields) {
//            System.out.println(declaredField.getName());
//        }
//    }
// getFields()：所有公有的域一直到他所有的父类都会显示出来
// getDeclaredFields():不管是什么访问限定修饰符，只返回当前类的域
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Human human = new Human();
        Class clazz = human.getClass();
        Constructor[] constructors = clazz.getConstructors();//定义构造方法的一维数组，因为构造方法可能不止一个
        System.out.println("---clazz.getConstructors()---");
        for (Constructor constructor : constructors) {//做一iter迭代循环
            System.out.println(constructor.getName());
            for (Parameter parameter : constructor.getParameters()) {//constructor.getParameters())  方法的参数
                System.out.println("\t" +parameter.getName());//只显示参数名字
                System.out.println("\t" +parameter);//显示参数名字和参数类型
            }
        }
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        System.out.println("---getDeclaredConstructors()---");
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
            for (Parameter parameter : declaredConstructor.getParameters()) {//每一构造方法的参数
                System.out.println("\t" + parameter);
            }
        }
 //getConstructors():返回 only public constructors
 //getDeclaredConstructors():返回 all the constructors
 //获取一构造器类的实例

        System.out.println("======以下获取某一个方法=======");
        Constructor constructor = clazz.getDeclaredConstructor(int.class,double.class,String.class,boolean.class);
        System.out.println(constructor.getName());
        for (Parameter parameter : constructor.getParameters()) {
            System.out.println(parameter);
        }
//  构造方法是用来初始化成员域，一般出现在new后面，生成类的实例对象并初始化成员域
//  而通过反射获取到的构造方法就可生成类的一个新的实例，采用的就不是之前的new了




        // constructor--> object
        Human human1 = (Human) constructor.newInstance(20,60,"Tom",false);
        System.out.println(human1.getName());

        Class clazz1 = Human.class;
        Method[] methods = clazz1.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("=-=-=-");

        Method[] declaredmethods = clazz1.getDeclaredMethods();
        for (Method declaredmethod : declaredmethods) {
            System.out.println(declaredmethod);
        }


        Human human2 = new Human();
        human2.setName("Jerry");
        Method method = clazz1.getDeclaredMethod("killAnimals",String.class);
        method.setAccessible(true);
        //利用反射对象获取的的method来调用当前方法本身
        method.invoke(human2,"cat");

// getMethods()：返回当前类及其 父类的公有方法
// getDeclaredMethods():返回当前类的所有方法




        Class clazz3 = Human.class;
        System.out.println(clazz3.getModifiers());
        Field field = clazz3.getDeclaredField("married");
        System.out.println(field.getModifiers());
        System.out.println(Modifier.toString(field.getModifiers()));



        System.out.println("->->->->->ArrayList与Vector不一样，没有capacity()方法->->->->->");
                        //但ArrayList有默认认构造方法初始容量为10
                        //可用反射模拟其capacity()方法
                        //反射发生在程序的运行时
                        //用反射的方式间接获取ArrayList的容量
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
        list.add(1);
        }
        list.add(0);
        System.out.println(list.size());
        Field array = list.getClass().getDeclaredField("elementData");//获取单个域
        array.setAccessible(true);// 要暴力访问(因为不在同一个包而elementData是default修饰的)
        System.out.println(((Object[])array.get(list)).length);// 获取当前list的容量10


        Vector<String> vector = new Vector<>();
        vector.add("hi");
        System.out.println(vector.size());
        System.out.println(vector.capacity());
    }
}
