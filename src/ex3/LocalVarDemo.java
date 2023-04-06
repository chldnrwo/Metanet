package ex3;

public class LocalVarDemo {
  public static void main(String[] args) {
    System.out.println("클래스 변수 : "+LocalVar.a);
    System.out.println("클래스 변수 : "+LocalVar.ball);
    System.out.println("클래스 변수 : "+LocalVar.geojit);
    LocalVar l = new LocalVar();
    System.out.println("인스턴스 변수 : "+l.b);
    l.methodTest();
  }
}
class LocalVar{
  static int a;
  static boolean geojit;
  static Ball ball;
  int b;
  void methodTest(){
    int a=1;
    System.out.println("지역 변수 : "+a);
  }
}
