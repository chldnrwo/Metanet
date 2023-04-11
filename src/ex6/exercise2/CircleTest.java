package ex6.exercise2;

public class CircleTest {
  public static void main(String[] args) {
    Circle c1 = new Circle(5.0);
    Circle c2 = new Circle(10.0);
    Circle c3 = new Circle(5.0);

    System.out.println(c1.equals(c2));
    System.out.println(c1.equals(c3));
  }
}
