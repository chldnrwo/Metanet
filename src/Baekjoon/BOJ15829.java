package Baekjoon;

import java.util.Scanner;

class BOJ15829 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    String s = in.next();

    long sum = 0;
    for(int i = 0; i < n; i++){
      int a = s.charAt(i)-96;
      long b = 1;
      for(int j = 0; j < i;j++){
        b = (b*31)%1234567891;
      }
      sum = (sum+a * b)%1234567891;
    }
    System.out.println(sum);
  }
}
/*



 */