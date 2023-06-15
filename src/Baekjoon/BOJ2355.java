
package Baekjoon;

import java.util.Scanner;

class BOJ2355 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    long a = in.nextLong();
    long b = in.nextLong();
    long sum = 0;



    if(a<b){
      sum = (b-a+1) * (a+b) / 2;
    }else{
      sum = (a-b+1) * (a+b) / 2;
    }

    System.out.println(sum);
  }
}
/*



 */