package ex3;

public class Ball {

    private double radius = 2.0;

  public Ball() {
  }
  public Ball(double radius) {
    this.radius = radius;
  }

  public double getVolumn(){
     return 4/3 * 3.14 * radius * radius * radius;
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
class Cylinder{
  double width = 2.0;
}
