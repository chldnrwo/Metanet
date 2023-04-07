package ex4.sec02;

public class Circle {
  private double radius;

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public void getArea() {
    System.out.println("넓이는 PI*R*R 입니다.");
  }
}

class Ball extends Circle {
  String color;

  public Ball() {
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void getVolume() {
    System.out.println("부피는 4/3*PI*R*R*R 입니다.");
  }

  @Override
  public void getArea() {
    System.out.println("넓이는 4*(PI*R*R) 입니다.");
  }
}