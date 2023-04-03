package ex;

public class CastDemo {
  public static void main(String[] args) {
    int i;
    double d;
    byte b;
    
    i = 7/4; // 1
    System.out.println("i = " + i);
    d = 7/4; // 1.75
    System.out.println("d = " + d);
    d = 7/(double)4; // 1.75
    System.out.println("d = " + d);

    i = 100;
    b = 100;
    b = (byte)i;

  }
}
