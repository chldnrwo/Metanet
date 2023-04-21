package Baekjoon;

import java.util.Scanner;

class BOJ1262 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int r1 = in.nextInt();
    int c1 = in.nextInt();
    int r2 = in.nextInt();
    int c2 = in.nextInt();

    res(n, r1, c1, r2, c2);
  }

  public static char calculateChar(int n, int i, int j) {
    int len = n * 2 - 1;
    int a = i % len;
    int b = j % len;

    if (a >= n) {
      a = len - a - 1;
    }

    if (b >= n) {
      b = len - b - 1;
    }

    int distance = Math.abs(a - (n - 1)) + Math.abs(b - (n - 1));

    if(distance>n-1){
      return '.';
    }
    return (char) ((distance%26) + 'a');
  }

  public static void res(int n, int r1, int c1, int r2, int c2) {
    StringBuilder sb = new StringBuilder();

    for (int i = r1; i <= r2; i++) {
      for (int j = c1; j <= c2; j++) {
        char c = calculateChar(n, i, j);
        sb.append(c);
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }
}
