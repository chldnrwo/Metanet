package ex3;

public class Circle2Demo {
  public static void main(String[] args) {
    Circle2 c = new Circle2(4.0);
    System.out.println(c.numCircles); // 인스턴스 변수
    System.out.println("클래스 변수"+c.numOfCircles); // 클래스 변수

    Circle2 c2 = new Circle2(4.0);
    System.out.println(c2.numCircles);// 인스턴스 변수
    System.out.println("클래스 변수" + c2.numOfCircles);// 클래스 변수
  }
}
