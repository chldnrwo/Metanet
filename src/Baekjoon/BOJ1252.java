package Baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

class BOJ1252 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String a = in.next();
    String b = in.next();

    BigInteger A = new BigInteger(a,2);
    BigInteger B = new BigInteger(b,2);

    A = A.add(B);
    String s = A.toString(2);
    System.out.println(s);

  }
}
/*
2^80이면 int로 안됨


 */