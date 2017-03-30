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
    }
}
