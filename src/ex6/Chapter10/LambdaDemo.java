package ex6.Chapter10;

public class LambdaDemo {
  public static void main(String[] args) {

    Myfunction f = new Myfunction() {
      @Override
      public int max(int i, int j) {
        return i > j ? i : j;
      }

    };
    int res = f.max(1, 2);
    System.out.println(res);

    Myfunction f1 = (a, b) -> a > b ? a : b;
    int res1 = f1.max(10, 20);
    System.out.println(res1);

  }

  @FunctionalInterface
  interface Myfunction {
    public abstract int max(int i, int j);

    //public abstract int min(int i, int j, int k);
  }
}