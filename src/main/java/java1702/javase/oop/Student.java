package java1702.javase.oop;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/30.
 * JavaSE_20171.
 */
public class Student {
    private String name;
    private int stuNo;
    private String hobby;

    //   set/get方法，封装学生属性

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
class StudentTest{
    public static void main(String[] args) {
        //生成一个学生数组
        Student[] stu = new Student[2];
        Student xixi = new Student(); // 实例化学生对象xixi
        xixi.setName("xixi");
        xixi.setStuNo(18);
        xixi.setHobby("我的爱好是音乐");

        Student dada = new Student();//实例化学生对象dada
        dada.setName("dada");
        dada.setStuNo(24);
        dada.setHobby("我的爱好是运动");


        //将xixi和dada放入学生对象数组

        stu[0] = xixi;
        stu[1] = dada;
        for (int i = 0; i < stu.length; i++) {
            System.out.println("大家好我是:" + stu[i].getName() + "我的学号是:" + stu[i].getStuNo() + "我的爱好是:" + stu[i].getHobby());

        }

    }
}
