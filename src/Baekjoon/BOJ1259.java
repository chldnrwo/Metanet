package Baekjoon;

import java.util.Scanner;

class BOJ1259 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while(true){
      String s = in.next();

      if(s.equals("0")){
        break;
      }

      if(pal(s)){
        System.out.println("yes");
      }else{
        System.out.println("no");
      }
    }


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
브루트 포스 / DP


 */