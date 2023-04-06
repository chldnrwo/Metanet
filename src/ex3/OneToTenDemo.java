package ex3;

public class OneToTenDemo {
  static int sum;
  static{
    int res = 0;
    for (int i = 1; i <= 10; i++) {
      res += i;
    }
    sum=res;
  }

  public static void main(String[] args) {
    System.out.println(sum);
  }
}
