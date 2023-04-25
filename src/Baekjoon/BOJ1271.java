package Baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

class BOJ1271 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String n = in.next();
    String m = in.next();

    BigInteger a = new BigInteger(n);
    BigInteger b = new BigInteger(m);

    BigInteger c = a.divide(b);
    BigInteger d = a.remainder(b);

    System.out.println(c);
    System.out.println(d);
  }
}
/*



 */
