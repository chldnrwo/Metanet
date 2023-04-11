package ex6;

public class ExceptionDemo {
  public static void main(String[] args) {

    try{
      System.out.println(1/0);
    } catch(ArithmeticException e){
      System.out.println(e.getMessage());
    }

//    System.out.println("예외처리 미적용");
//    System.out.println(1/0);
  }
}
