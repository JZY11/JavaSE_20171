package java1702.javase.basic;

/**
 * Created by Tony.Jaa on 2017/3/15.
 */
public class Human {
    // 1.域  （名词或形容词）
    private boolean isMale;
    String name;
    int age;
    private double weight;
    private String gender;//性别  男  女   Male   Female
    // 2.方法 （动词）
//    public void write(String c , double a , byte b , int d , boolean e){
        // .write("bcaahiai" , 1.2 , 123 , 78 , true)  调用write方法
//        boolean i = true;//局部变量
//    }
    public void read(){//void 表示不返回任何值
        long test = 2L;
    }
//    public int test(){
//        ........
//        return 0;
//    }
//    public  String test2(){
//        return null;// 也可为"fgfsg"或""  null为一切引用数据的默认值
//    }
//    public java1702.javase.basic.Human(String s , double d){//当前类的构造器  1.构造方法  2.成员方法
//
//        public Human(boolean isMale, String name , int age, double weight, String gender) {
//            this.isMale = isMale;
//            this.name = name;
//            this.age = age;
//            this.weight = weight;
//            this.gender = gender;
//        }

    public Human(boolean isMale, String name, int age, double weight, String gender) {
        this.isMale = isMale;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

//        name = s;
//        weight = d;
//    }

    public Human(){}//类的默认构造方法
}
