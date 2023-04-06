package ex3;

public class BallDemo {
  public static void main(String[] args) {
    Ball ball = new Ball();
    double volumn = ball.getVolumn();
    System.out.println("ball = " + ball.getRadius());
    System.out.println("volumn = " + volumn);
    
    ball.setRadius(-4.0);
    double volumn2 = ball.getVolumn();
    System.out.println("ball = " + ball.getRadius());
    System.out.println("volumn2 = " + volumn2);

    Circle circle = new Circle(10.0);
    System.out.println(circle.getRadius());
    circle.setRadius(-1.0);
    circle.setRadius(4.0);
    System.out.println(circle.getRadius());

    Circle circle1 = new Circle();
    System.out.println(circle1.getRadius());
  }
}
class Circle{
  double radius = 1.0;

  public Circle(){
    radius = 2.0;
  }

  public Circle(double radius){
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    if(radius > 0){
      this.radius = radius;
    }else {
      System.out.println("원의 반지름은 0보다 커야 합니다.");
    }
  }
}
