package ex3;

public class Circle1Demo {
  public static void main(String[] args) {
    Circle1 c1 = new Circle1();
    Circle1 c2 = new Circle1(10.0);
    Circle1 c3 = new Circle1("red");
    Circle1 c4 = new Circle1(5.0, "blue");

    System.out.println(c1.color + " " + c1.radius);
    System.out.println(c2.color + " " + c2.radius);
    System.out.println(c3.color + " " + c3.radius);
    System.out.println(c4.color + " " + c4.radius);
  }
}
