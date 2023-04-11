package ex6;

import java.util.Arrays;

public class ArraysDemo {
  public static void main(String[] args) {
    char[] a1 = {'j', 'a', 'v', 'a'};
    char[] a2 = Arrays.copyOf(a1, a1.length);
    Integer[] a3 ={1,2,3};

    System.out.println(a2);
    String[] sa = {"케이크", "애플", "도넛", "바나나"};
    System.out.println(Arrays.toString(sa));

    Arrays.sort(sa);
    System.out.println(Arrays.toString(sa));

    Arrays.fill(sa, 2, 4, "기타");
    System.out.println(Arrays.toString(sa));

    printArray(sa);
    printArray(a3);
  }
  static void printArray(Object[] array){
    System.out.println(Arrays.toString(array));
  }
}
