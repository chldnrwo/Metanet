package Baekjoon;

import java.util.Scanner;

class BOJ10808 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String s = in.next();
    int[] arr = new int[26];
    for(int i = 0; i < s.length(); i++){
      int a = s.charAt(i) - 97;
      arr[a]++;
    }

    for(int i = 0; i < 26; i++){
      System.out.print(arr[i]+" ");
    }
  }
}
/*



 */