package ex2;

public class MethodDemo {
  public static void main(String[] args) {
    plus(2_000_000_000, 2_000_000_000);
  }
  public static void plus(long i1, long i2){
    long a = i1+i2;
    System.out.println(a);
    return;
  }
}
