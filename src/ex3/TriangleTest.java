package ex3;

public class TriangleTest {
  public static void main(String[] args) {
    Triangle t = new Triangle(10.0, 5.0);
    System.out.println(t.findArea());
  }
  public static class Triangle {
    private double a;
    private double b;

    Triangle(double a, double b) {
      this.a = a;
      this.b = b;
    }

    double findArea() {
      return a * b / 2;
    }
  }
}
