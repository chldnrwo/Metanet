package ex5;

public abstract class Shape {

  double p1 = 3.14;
  abstract void draw();

  public double findArea() {
    return 0.0;
  }
}
class Circle2 extends Shape {

  double radius;

  @Override
  void draw() {
    System.out.println("원을 그린다.");
  }

  @Override
  public double findArea() {
    return p1 * radius * radius;
  }
}
class Rectangle extends Shape {
  double width;
  double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  void draw() {
    System.out.println("사각형을 그린다.");
  }
  @Override
  public double findArea() {
    return width * height;
  }
}