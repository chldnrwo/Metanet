
package Baekjoon;

import java.util.Scanner;

class BOJ15964 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    long a = in.nextInt();
    long b = in.nextInt();

    long res = (a+b) * (a-b);
    System.out.println(res);
  }
}
/*



 */