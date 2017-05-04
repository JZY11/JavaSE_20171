package java1702.javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/5/3.
 * JavaSE_20171.
 */
/*
     反射   与域有关
 */
class Animals{
    public int age;
    private double weight;

    public Animals() {
    }

    public Animals(int age, double weight) {
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
        super(age, weight);
        this.name = name;
        this.married = married;
    }

    @Override
    public void eat(String food) {
        super.eat(food);
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

    public void setMarried(boolean married) {
        this.married = married;
    }
}
class HumanTest{
//    public static void main(String[] args) {
//        Human human = new Human();
//        Class clazz = human.getClass();
//        Field[] fields = clazz.getFields();
//        System.out.println("---getFields()---");
//        for (Field field : fields) {// 进行迭代
//            System.out.println(field.getName());
//        }
//        Field[] declaredFields = clazz.getDeclaredFields();
//        System.out.println("---getDeclaredFields()---");
//        for (Field declaredField : declaredFields) {
//            System.out.println(declaredField.getName());
//        }
//    }

    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException {
        Human human = new Human();
        Class clazz = human.getClass();
        Constructor[] constructors = clazz.getConstructors();
        System.out.println("---clazz.getConstructors()---");
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
            for (Parameter parameter : constructor.getParameters()) {
                System.out.println("\t" +parameter.getName());
                System.out.println("\t" +parameter);
            }
        }
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        System.out.println("---getDeclaredConstructors()---");
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
            for (Parameter parameter : declaredConstructor.getParameters()) {
                System.out.println("\t" + parameter);
            }
        }
        System.out.println("======以下获取某一个方法=======");
        Constructor constructor = clazz.getDeclaredConstructor(int.class,double.class,String.class,boolean.class);
        System.out.println(constructor.getName());
        for (Parameter parameter : constructor.getParameters()) {
            System.out.println(parameter);
        }


        System.out.println("->->->->->ArrayList与Vector不一样，没有capacity()方法->->->->->");
                        //但ArrayList有默认认构造方法初始容量为10
                        //可用反射模拟其capacity()方法
                        //反射发生在程序的运行时
        List<Integer> list = new ArrayList<>();
        list.add(0);
        System.out.println(list.size());
        Field array = list.getClass().getDeclaredField("elementData");//获取单个域
        array.setAccessible(true);// 要暴力访问(因为不在同一个包而elementData是default修饰的)
        System.out.println(((Object[])array.get(list)).length);// 获取当前list的容量10
    }
}
