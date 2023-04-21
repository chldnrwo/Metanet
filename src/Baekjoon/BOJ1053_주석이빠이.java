package Baekjoon;

import java.util.Scanner;

class BOJ1053_주석이빠이 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);


  }
  public static boolean pal(String s){
    StringBuilder sb = new StringBuilder();
    String s2 = sb.append(s).reverse().toString();

    if(s.equals(s2)){
      return true;
    }
    return false;
  }
}
/*
다이나믹 프로그래밍(아마 2차원 ijk까진 안씀)
브루트포스 알고리즘

이미 팰린드롬이면 0 출력

1. 문자열의 어떤 위치에 어떤 문자를 삽입 (시작과 끝도 가능)
2. 어떤 위치에 있는 문자를 삭제
3. 어떤 위치에 있는 문자를 교환
4. 서로 다른 문자를 교환(1번만 가능)


 */
