package java1702.javase.basic;

/**
 * Created by Tony.Jaa on 2017/3/18.
 */
public class Test5 {
    public static void main(String[] args) {
        Volume volume = new Volume(2.0);
        System.out.println(volume.tiji(3.14, 2.0));
    }
}
class Volume{
    double pai;
    double r;

    public Volume(double r) {
        this.r = r;
    }

    public double tiji(double pai, double r){
        return 4 / 3 * pai * r * r * r;
    }
}
