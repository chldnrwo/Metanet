package ex4.sec03;

public class InheritanceDemo {
  public static void main(String[] args) {
    Circle c1 = new Circle();
    c1.getArea();

    Ball b1 = new Ball(10.0, "빨간색");
    System.out.println(b1.color);
    b1.getArea();
    //b1.secret();
  }
}