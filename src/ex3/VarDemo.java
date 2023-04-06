package ex3;

public class VarDemo {
  public static void main(String[] args) {
    System.out.println("class 변수 :"+VarTest.staticVar);
    //System.out.println(VarTest.getStaticVar());
    VarTest.staticVar = 10;
    VarTest v = new VarTest();
    System.out.println("instance 변수 :"+v.instanceVar);
    v.instanceVar = 10;
    v.methodTest();
    System.out.println(Math.PI);
  }
}
class VarTest{
  static int staticVar=5;
  int instanceVar;
  void methodTest(){
    int localVar=20;
    System.out.println("localVar :"+localVar);
  }

  public static int getStaticVar() {
    return staticVar;
  }
}
