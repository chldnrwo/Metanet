package ex3;

public class String2Demo {
  public static void main(String[] args) {
    String s1 = "Hi, Java !";
    String s2 = "Hi, Code !";
    String s3 = "hi, java !";

    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s3));

    System.out.println("비교 : " + s1.compareTo(s2));
    System.out.println("비교 : " + s2.compareTo(s1));
    System.out.println("비교 : " + s1.compareToIgnoreCase(s3));
  }
}
