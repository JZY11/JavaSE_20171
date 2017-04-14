package java1702.javase.generic;

/**
 * Created by zhenya.1291813139.com
 * on 2017/4/13.
 * JavaSE_20171.
 */
public class SuperClass<T> {
//    public T method(T t, T a){
//        return t;
//    }
    public void method(T t){
        System.out.println("method...");
    }
}
class SubClass<T> extends SuperClass<T>{
    public static void main(String[] args) {

    }
}
