package ex3;

public class StringDemo {
  public static void main(String[] args) {
    String s1 = "Hi, JAVA !";
    String s2 = "Hi, JAVA !";
    String s3 = new String("Hi, JAVA!");
    String s4 = new String("Hi, JAVA!");

    System.out.println("s1 = " + s1);
    System.out.println("s2 = " + s2);
    System.out.println("s3 = " + s3);
    System.out.println("s4 = " + s4);
    System.out.println(s1 == s2);
    System.out.println(s1 == s3);
    System.out.println(s3 == s4);
  }
}
