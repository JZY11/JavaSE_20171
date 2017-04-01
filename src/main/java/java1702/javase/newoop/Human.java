package java1702.javase.newoop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/1.
 * JavaSE_20171.
 */
public class Human {
    private String name;
    private int age;
    private char gender;
    private double weight;
    private double height;


    //    一些构造方法(constructor)


    public Human(String name, int age, char gender, double weight, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }

    public void eat(String foods, int amount) {
        System.out.println(name + "吃了" + amount + foods);

    }

    public int sleep(boolean isPlayGame) {
//        if (isPlayGame) {
//            return 1;
//        } else {
//            return 8;
//        }
        return isPlayGame ? 1 : 8;//  三目运算符

    }

    public String study(int studyTime) {//call&invoke method 调用方法
        System.out.println(name + "学习了" + studyTime + "小时。");
        return "一份English homework";

    }

    public void work() {

    }
}
