package Baekjoon;

import java.util.Scanner;

class BOJ2445 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();

    for(int i = 0; i < n; i++) { // 0 1 2 3 4
      for(int j = 0; j <= i; j++) { // 1 2 3 4 5
        System.out.print("*");
      }
      for(int j = 0; j <= n-i-2; j++) { //4 3 2 1 0
        System.out.print("  ");
      }
      for(int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i = 0; i < n-1; i++){ // 0 1 2 3
      for(int j = n-2; j >= i ; j--){
        System.out.print("*");
      }
      for(int j = 0; j <= i ; j++){  // 6 5 4 3
        System.out.print("  ");
      }
      for(int j = n-2; j >= i ; j--){ // 4 3 2 1
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
/*



 */
