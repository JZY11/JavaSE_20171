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

    public static void main(String[] args) {
        //     构造方法需要创建类的对象来调用
        Human human = new Human("Tom", 18, 'M',65, 1.7);
        System.out.println(human.name);//  对象加.来引用当前类中的域
        System.out.println(human.age);
        System.out.println(human.gender);
        System.out.println(human.height);
        System.out.println(human.weight);
        human.study(5);//  成员方法可以用对象直接调用  无返回值(void)  调用方法是要传入实参
        System.out.println("------->");
        System.out.println(human.study(5));
        human.eat("西红柿", 5);
        System.out.println(human.sleep(true));//  有返回类型int，有返回值，所以要放在控制台输出语句中来接收
    }
}
