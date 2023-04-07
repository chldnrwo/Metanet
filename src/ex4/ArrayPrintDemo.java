package ex4;

import java.util.Arrays;

public class ArrayPrintDemo {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4};
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    System.out.println(arr);
    System.out.println(Arrays.toString(arr));

    char[] cArr = {'a', 'b', 'c', 'd'};
    System.out.println(cArr);
    System.out.println(Arrays.toString(cArr));
  }
}
