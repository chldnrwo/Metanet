package Baekjoon;

import java.util.Scanner;

class BOJ9095 {
  static int[] arr;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    arr = new int[12];
    arr[1] = 1;
    arr[2] = 2;
    arr[3] = 4;
    for(int i=0;i<n;i++){
      int num = in.nextInt();

      int res = dp(num);
      System.out.println(res);
    }


  }
  public static int dp(int n){
    if(arr[n]==0){
      arr[n] = dp(n-1) + dp(n-2) + dp(n-3);
    }

    return arr[n];
  }
}
/*



 */