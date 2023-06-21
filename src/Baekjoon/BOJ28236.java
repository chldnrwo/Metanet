package Baekjoon;

import java.util.Scanner;

class BOJ28236 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int m = in.nextInt();
    int k = in.nextInt();

    int first = -1;
    int minLength = Integer.MAX_VALUE;
    for(int i = 1; i <= k; i++) {
      int floor = in.nextInt();
      int d = in.nextInt();

      int length = (floor-1) + (4 - d);
      if(length < minLength){
        minLength = length;
        first = i;
      }
    }

    System.out.println(first);
  }
}
/*



 */
