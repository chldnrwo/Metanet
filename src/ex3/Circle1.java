package ex3;

public class Circle1 {
  double radius;
  String color;

  public Circle1(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  public Circle1(double radius) {
    this(radius, "white");
  }

  public Circle1(String color) {
    this(1.0, color);
  }

  public Circle1() {
    this(1.0, "white");
  }
}
