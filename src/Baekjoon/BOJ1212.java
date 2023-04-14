package Baekjoon;

import java.util.Scanner;

class BOJ1212 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    String[] ss= {"000","001","010","011","100","101","110","111"};
    String s = in.next();


    for (int i = 0; i<s.length(); i++) {
      char c = s.charAt(i);
      int a = c - 48;
      sb.append(ss[a]);
    }
    if(s.equals("0")){
      System.out.println(s);
    }else{
      while(sb.charAt(0)=='0'){
        sb = new StringBuilder(sb.substring(1));
      }
      System.out.println(sb);
    }
  }
}
/*



 */