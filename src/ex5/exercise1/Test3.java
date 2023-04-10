package ex5.exercise1;

public class Test3 {
  public static void main(String[] args) {
    Car c = new Car("파랑", 200,1000,5);
    c.show();

    System.out.println();
    Vehicle v = c;
    v.show();
  }
}
class Vehicle {
  static String color;
  static int speed;

  public Vehicle(String color, int speed) {
    this.color = color;
    this.speed = speed;
  }

  static void show(){
    System.out.println(color+" "+speed);
  }
}
class Car extends Vehicle {
  static int displacement;
  static int gears;

  public Car(String color, int speed, int displacement, int gears) {
    super(color, speed);
    this.displacement = displacement;
    this.gears = gears;
  }
  static void show() {
    System.out.println(color+" "+speed+" "+displacement+" "+gears);
  }
}
