package ex5;

public class PolygonDemo {
  public static void main(String[] args) {
    Triangle[] triangles = new Triangle[2];
    Circle[] circles = new Circle[2];
    Polygon[] polygons = new Polygon[4];

//    triangles[0] = new Triangle();
//    circles[0] = new Circle();

    polygons[0] = new Triangle();
    polygons[1] = new Circle();

    getValue(polygons[0]);
    getValue(polygons[1]);

  }

  static void getValue(Polygon p) {
    // triangles이면 width, height 를 출력
    if (p instanceof Triangle) {
      Triangle t = (Triangle) p;
      System.out.println(t.width + " " + t.height);
    } else if (p instanceof Circle) {    // circles이면 radius 를 출력
      Circle c = (Circle) p;
      System.out.println(c.radius);
    }
  }
}

class Polygon {
  public double area() {
    return 0;
  }
}

class Triangle extends Polygon {
  int width = 10, height = 10;
  public double area() {
    return 0;
  }
}

class Circle extends Polygon {
  double radius = 5.0;
  public double area() {
    return 0;
  }
}