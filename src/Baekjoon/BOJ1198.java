package Baekjoon;

import java.util.Scanner;

class BOJ1198 {
  static double max = 0;
  static int[][] arr;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    arr = new int[n][2];
    for(int i = 0; i < n; i++){
      arr[i][0] = in.nextInt();
      arr[i][1] = in.nextInt();
    }

    for(int i = 0; i < n; i++){
      for(int j = i+1; j < n; j++){
        for(int k = j+1; k < n; k++){
          cal(i, j, k);
        }
      }
    }
    System.out.println(max);
  }
  public static void cal(int i, int j, int k){
    int x1 = arr[i][0];
    int x2 = arr[j][0];
    int x3 = arr[k][0];
    int y1 = arr[i][1];
    int y2 = arr[j][1];
    int y3 = arr[k][1];

    double s1 = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
    s1 = Math.abs(s1) / 2;

    max = Math.max(max, s1);
  }
}
/*
삼각형은 1개 이상이 있을 수 있다


 */
