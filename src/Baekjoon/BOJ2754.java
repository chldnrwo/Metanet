
package Baekjoon;

import java.util.Scanner;

class BOJ2754 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String s = in.next();

    if(s.equals("F")){
      System.out.println(0.0);
      System.exit(0);
    }

    char c0 = s.charAt(0);
    char c1 = s.charAt(1);

    double a = 69 - c0;

    if(c1 == '+'){
      a += 0.3;
    }else if(c1 == '-'){
      a -= 0.3;
    }

    System.out.println(a);

  }
}
/*



 */