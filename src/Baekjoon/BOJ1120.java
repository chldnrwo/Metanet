package Baekjoon;

import java.util.Scanner;

class BOJ1120 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String a = in.next();
    String b = in.next();

    int lenA = a.length();
    int lenB = b.length();

    int max = 0;

    for(int i=0;i<lenB-lenA+1;i++){
      int cnt = 0;
      for(int j=0;j<lenA;j++){
        if(a.charAt(j) == b.charAt(i+j)){
          cnt++;
        }
      }
      //System.out.println(cnt);
      max = Math.max(max, cnt);
    }
    System.out.println(lenA - max);
  }
}
//공통문자열 찾기
// adaabc
//aababbc