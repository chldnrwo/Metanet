package Baekjoon;

import java.util.Scanner;

public class BOJ28086 {
  static char[] map = new char[100];

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    map = input.toCharArray();

    int fircnt;
    for (fircnt = 0; fircnt < map.length && map[fircnt] != '/' && (map[fircnt] != '+' || fircnt == 0) && (map[fircnt] != '-' || fircnt == 0) && map[fircnt] != '*'; fircnt++) {
    }

    long firsum = 0;
    for (int i = fircnt - 1; i >= 0; i--) {
      if (i == 0 && map[i] == '-') {
        firsum = -firsum;
        continue;
      }
      firsum += (map[i] - '0') * multiple(8, fircnt - 1 - i);
    }

    int secnt;
    for (secnt = fircnt + 1; secnt < map.length && map[secnt] != 0; secnt++) {
    }

    long sesum = 0;
    for (int i = secnt - 1; i > fircnt; i--) {
      if (i == fircnt + 1 && map[i] == '-') {
        sesum = -sesum;
        continue;
      }
      sesum += (map[i] - '0') * multiple(8, secnt - 1 - i);
    }

    if (map[fircnt] == '/') {
      if (sesum == 0) {
        System.out.println("invalid");
        return;
      }
      double sum = firsum / sesum;
      if (firsum < 0 ^ sesum < 0 && firsum % sesum != 0) {
        sum--;
      }
      if (sum < 0) {
        System.out.printf("-%o\n", -(long) (Math.floor((float) firsum / sesum)));
      }else {
        System.out.printf("%o\n", (long) (Math.floor((float) firsum / sesum)));
      }
    }
    if (map[fircnt] == '+') {
      if (firsum + sesum < 0)
        System.out.printf("-%o", -(firsum + sesum));
      else
        System.out.printf("%o", firsum + sesum);
    }
    if (map[fircnt] == '-') {
      if (firsum - sesum < 0) {
        System.out.printf("-%o", -(firsum - sesum));
      } else {
        System.out.printf("%o", firsum - sesum);
      }
    }
    if (map[fircnt] == '*') {
      if (firsum * sesum < 0)
        System.out.printf("-%o", -(firsum * sesum));
      else
        System.out.printf("%o", firsum * sesum);
    }
  }

  static long multiple(int a, int n) {
    long c = 1;
    for (int i = 0; i < n; i++) {
      c *= a;
    }
    return c;
  }
}
