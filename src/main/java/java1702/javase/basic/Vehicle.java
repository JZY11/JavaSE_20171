package java1702.javase.basic;

/**
 * Created by Tony.Jaa on 2017/3/15.
 */
public class Vehicle {
  String name;
  double weight;
  char color;

    public Vehicle() {
        System.out.println("java1702.javase.basic.Vehicle consructor...");
    }
    //    public java1702.javase.basic.Vehicle(String name, double weight, char color) {
//        this.name = name;
//        this.weight = weight;
//        this.color = color;
//    }

    public void start(){
      System.out.println("java1702.javase.basic.Vehicle is starting...");//控制输出语句
  }
  public void stop(){
      System.out.println("java1702.javase.basic.Vehicle is stopped...");
  }
}
class Bicycle extends Vehicle{
    int carriageWheel;

    public Bicycle() {
        System.out.println("java1702.javase.basic.Bicycle consructor...");
    }

    public void brake(){}

}
class Ship extends  Vehicle{
    boolean hasWing;
    public void sit(){}
}
class  Plan extends Vehicle{
    int tail;
    public void fly(){}
}
class VehicleTest{
    public static void main(String[] args) {
//        java1702.javase.basic.Vehicle vehicle = new java1702.javase.basic.Vehicle();
//        System.out.println((int) vehicle.color);
//        vehicle.stop();
//        Bicycle bicycle = new Bicycle();
//        System.out.println(bicycle.color);
//        System.out.println(bicycle.carriageWheel);
//        bicycle.stop();
//        bicycle.brake();
//        java1702.javase.basic.Ship ship = new java1702.javase.basic.Ship();
//        System.out.println(ship.weight);
//        System.out.println(ship.hasWing);
//        ship.stop();
//        ship.sit();
//        java1702.javase.basic.Plan plan = new java1702.javase.basic.Plan();
//        System.out.println(plan.color);
//        System.out.println(plan.tail);
//        plan.start();
//        plan.fly();

    }
}


