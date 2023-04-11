package Baekjoon;

import java.util.Scanner;

class BOJ1019_logN {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    getNum(n);
  }

  public static void getNum(int n) {
    int[] nlist = new int[11];

    for (int i = 1; i <= 10; i++) {
      nlist[i] += (n / 10);
      if (n % 10 >= i) {
        nlist[i] += 1;
      }

      for (int k = 1; k <= 9; k++) {
        int temp1 = (int) Math.pow(10, k);
        int temp2 = (int) Math.pow(10, k + 1);
        if (n >= temp1) {
          nlist[i] += ((n - temp1 + 1) / temp2) * temp1;
          if ((n - temp1 + 1) % temp2 >= i * temp1) {
            nlist[i] += temp1;
          } else if ((n - temp1 + 1) % temp2 >= (i - 1) * temp1) {
            nlist[i] += (n + 1) % temp1;
          }
        }
      }
    }

    nlist[0] = nlist[nlist.length - 1];
    for (int i = 0; i < 10; i++) {
      System.out.print(nlist[i] + " ");
    }
  }
}
//O(logn)속도 풀이