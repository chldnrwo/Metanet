package ex3;

public class SingletonDemo {
  public static void main(String[] args) {
    Singleton s = Singleton.getInstance();
    Singleton s1 = Singleton.getInstance();

    System.out.println("s1 = " + s);
    System.out.println("s1 = " + s1);
    System.out.println(s == s1);
  }
}
