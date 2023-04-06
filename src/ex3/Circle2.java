package ex3;

public class Circle2 {
  double radius;
  static int numOfCircles = 0;
  int numCircles = 0;

  public Circle2(double radius) {
    this.radius = radius;
    numCircles++;
    numOfCircles++;
  }

  public double getRadius() {
    return radius;
  }
  //객체와 관련된 인스턴스 변수를 사용할 수 없다. (O)
//객체와 관련된 인스턴스 메서드를 호출할 수 없다. (O)
//객체 자신을 가리키는 this 키워드를 사용할 수 없다.(O)
  static void printCircles() {
    System.out.println("Number of Circles: " + Circle2.numOfCircles);
    //System.out.println("Number of Circles: " + Circle2.numCircles);
    //getRadius();
    //this.radius = 10.0;
  }
}