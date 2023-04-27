package Baekjoon;

import java.util.Scanner;

class BOJ1286 {
  static long[] arr = new long[26];
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int m = in.nextInt();
    int t,r;
    for(int i = 0; i < n; i++) {
      t=(i+1)*((n-i)+n)+((i+1)+n)*(n-i);
      String s = in.next();
      for(int j=0;j<m;j++)
      {
        r=(j+1)*((m-j)+m)+((j+1)+m)*(m-j);
        arr[s.charAt(j)-'A']+=t*r;
      }
    }
    for (int i = 0; i < 26; i++) {
      System.out.println(arr[i]);
    }
  }
}
/*
메모리가 작다 다 쓰면 안됨


 */