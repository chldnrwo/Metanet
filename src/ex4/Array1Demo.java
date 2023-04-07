package ex4;

import java.util.Scanner;

public class Array1Demo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] arr = new int[5];

    int sum=0;
    for(int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
      sum += arr[i];
    }

    System.out.println(sum);
    System.out.println(sum/(double)arr.length);
  }
}
