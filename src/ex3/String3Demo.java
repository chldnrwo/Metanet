package ex3;

public class String3Demo {
  public static void main(String[] args) {
    String s1 = "hi";
    String s2 = new String("Java");
    int len = s1.length();
    int len2 = s2.length();

    System.out.println(len);
    System.out.println(len2);
    System.out.println(s2.charAt(0));
    System.out.println(s2.toLowerCase());
    System.out.println(s2.toUpperCase());

    System.out.println(s2.substring(1,2));
    System.out.println(s2);

    String s3 = " ";
    String s4 = "";
    String s5;
    System.out.println(s3.isEmpty());
    System.out.println(s3.isBlank());
    System.out.println(s4.isEmpty());
    System.out.println(s4.isBlank());
    System.out.println();
  }
}
