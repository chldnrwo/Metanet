package ex5.Section4;

public class MovableDemo {
  public static void main(String[] args) {
    Movable m = new Car();
    m.move(5);

    Car car = (Car)m;
    car.move(10);
    car.show();
  }
}
