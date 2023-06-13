package Baekjoon;

import java.util.Scanner;

class BOJ2748 {
  static long n;
  static long[] arr;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    arr = new long[91];
    arr[0] = 0;
    arr[1] = 1;


    System.out.println(dp((int) n));
  }
  public static long dp(int n){
    if(arr[n] == 0 && n!=0){
      arr[n] = dp(n-1) + dp(n-2);
    }

    return arr[n];
  }
}
/*



 */
