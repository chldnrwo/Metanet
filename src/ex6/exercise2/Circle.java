package ex6.exercise2;

public class Circle {
  double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }
  @Override
  public boolean equals(Object o) {
    if (o instanceof Circle) {
      Circle c = (Circle) o;
      if (c.getArea() == this.getArea()) {
        return true;
      }
    }
    return false;
  }
}
