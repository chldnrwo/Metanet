package ex6;

public class Exception2Demo {
  public static void main(String[] args){
    try {
      test1("123");
      test1("ABC");
    } catch (NumberFormatException e) {
      System.out.println("숫자로 변환할 수 업는 문자열입니다.");
      System.out.println(e.getMessage());
    } finally {

    }

  }
  private static void test1(String s){
    int n = Integer.parseInt(s);
    System.out.println(n);
  }
}
