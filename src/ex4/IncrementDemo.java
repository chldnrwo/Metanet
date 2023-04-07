package ex4;

public class IncrementDemo {
  public static void main(String[] args) {
    int[] numbers = new int[1];
    int x = 0;
    System.out.println("before increment");
    System.out.println(numbers[0]); // [0]
    System.out.println("x = " + x); // 0
    increment(numbers, x);
    System.out.println("after increment");
    System.out.println(numbers[0]); // [?]
    System.out.println("x = " + x); // ?
  }
  public static void increment(int[] numbers, int number) {
    int x = number;
    numbers[0]++;
    x++;
    System.out.println("메서드 numbers  : " + numbers[0]); // 1
    System.out.println("메서드 x  : " + x); // 1
  }
}