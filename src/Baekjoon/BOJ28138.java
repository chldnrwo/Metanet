package Baekjoon;

import java.util.Scanner;

class BOJ28138 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    long n = in.nextLong();
    long r = in.nextLong();

    long num = n - r;

    long sum = 0L;
    for (long i = 1; i * i <= num; i++) {
      if (num % i == 0) {
        if (r < i) {
          sum += i;
        }
        if (r < num / i && i * i != num) {
          sum += num / i;
        }
      }
    }

    System.out.println(sum);
  }
}
