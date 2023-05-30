package Baekjoon;

import java.util.Scanner;

class BOJ11726 {
  static int[] arr = new int[1001];
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    arr[1]=1;
    arr[2]=2;

    System.out.println(fibo(n));
  }
  public static int fibo(int n){
    if(arr[n]==0){
      arr[n] = fibo(n-1)+ fibo(n-2);
    }
    return arr[n]%10007;
  }
}
/*



 */
