package Baekjoon;

import java.util.Scanner;

class BOJ1013 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String vega = "(100+1+|01)+";
    int t = in.nextInt();

    for(int i = 0; i < t; i++) {
      String spread = in.next();
      if(spread.matches(vega)) System.out.println("YES");
      else System.out.println("NO");
    }

  }

}

