
package Baekjoon;

import java.util.Scanner;

class BOJ25379 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    long Lcnt = 0;
    long Rcnt = 0;
    long sum = 0;
    int idx = 0;
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      int num = in.nextInt();

      if (num % 2 == 0) {
        sum+=idx++;
        Lcnt+=i;
        Rcnt+=n-1-i;
      }
    }
    System.out.println(Math.min(Lcnt, Rcnt) -sum);


  }
}
/*



 */
