package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

class BOJ1246 {
  static int max;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int M = in.nextInt();
    max = 0;
    int idx = 0;
    int[] arr = new int[M];
    for (int i = 0; i < M; i++) {
      arr[i] = in.nextInt();
    }
    Arrays.sort(arr);
    for(int i = 0; i < M; i++) {

      int tmp = arr[i] * Math.min(M-i, N);
      if(tmp > max) {
        max = tmp;
        idx = arr[i];
      }
    }
    System.out.println(idx+" "+max);
  }
}
/*
N(1 ≤ N ≤ 1,000)과 M(1 ≤ M ≤ 1,000)
Pi(1 ≤ Pi ≤ 1,000,000)

5 4
2
8
10
7

2 4
2
8
10
7

이 경우 16이 나와야됨

달걀이 더 적을 수도 있다

 */
