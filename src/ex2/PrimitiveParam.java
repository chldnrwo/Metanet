package ex2;

public class PrimitiveParam {
  public static void main(String[] args) {
    int sum=100;
    System.out.println("before sum = " + sum);
    inc(sum);
    System.out.println("after sum = " + sum);
  }
  public static void inc(int i){
    int sum=i;
    sum ++;
    System.out.println("in sum = " + sum);
  }
}
