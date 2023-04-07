package ex4.sec03;

public class Circle {
  public double radius;

  // private (같은 클래스안에서만 접근 가능) < default (같은 패키지안에 있으면 접근 가능)
  // < protected (다른 패키지에 있더라도 상속 관계 접근 가능)< public (아무 패키지에서 사용 가능)

  private void secret() {
    System.out.println("비밀입니다.");
  }

  protected void getRadius() {
    secret();
    System.out.println("반지름은 10.0 입니다.");
  }

  public void getArea() {
    System.out.println("넓이는 PI*R*R 입니다.");
  }
}

class Ball extends Circle {
  String color;
  public Ball(double radius, String color) {
    super.radius = radius;
    this.color = color;
  }
  @Override
  protected void getRadius() {
    super.getRadius();
  }

  @Override
  public void getArea() {
    super.getArea();
  }
}