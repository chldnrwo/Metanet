package ex5;

public class ShapeDemo {
  public static void main(String[] args) {
    //Shape shape = new Shape();
    Circle2 circle = new Circle2();

    Shape shape = new Circle2();

    Rectangle r = new Rectangle(2.0, 10.0);
    r.draw();
    System.out.println(r.findArea());
    Shape s2 = new Rectangle(2.0, 10.0);
    r.draw();
    System.out.println(r.findArea());
  }
}
