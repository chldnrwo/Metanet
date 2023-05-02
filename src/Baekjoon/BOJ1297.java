package Baekjoon;

import java.util.Scanner;

class BOJ1297 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();

    double A = Math.pow(a, 2);
    double B = Math.pow(b, 2);
    double C = Math.pow(c, 2);

    double resB = A*B / (B+C);
    double resC = A*C / (B+C);
    int resB2 = (int)Math.sqrt(resB);
    int resC2 = (int)Math.sqrt(resC);

    System.out.println(resB2+" "+resC2);
  }
}
/*



 */
