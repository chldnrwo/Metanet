package ex8.Chapter12.Anno;

public class Service {
  @PrintAnnotation(value = "*", number=20)
  public void method1() {
    System.out.println("method1이 실행됩니다.");
  }

  @PrintAnnotation
  public void method2() {
    System.out.println("method2가 실행됩니다.");
  }
  @PrintAnnotation(value = "+")
  public void method3() {
    System.out.println("method3가 실행됩니다.");
  }
}
