package ex1;

public class CastDemo2 {
  public static void main(String[] args) {
    char three;

    three = 3 + '0';

    System.out.println("문자 3 : "+three);

    int i = three - '0';
    System.out.println("숫자 3 : "+i);
    System.out.println("" + 7 + 7);
    System.out.println(7 + 7 + "");

    String s = "31";
    i = Integer.parseInt(s);
    System.out.println(i);
    
    three = s.charAt(0);
    char one = s.charAt(1);
    System.out.println(three);
    System.out.println("one = " + one);
  }
}
