package Baekjoon;

import java.util.Scanner;

class BOJ28135 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int cnt = 0;
    for(int i = 1;i<n;i++){
      if(check(i)){
        cnt+=2;
      }else{
        cnt++;
      }

    }
    System.out.println(cnt+1);
  }
  public static boolean check(int i){
    String s = String.valueOf(i);

    for(int j=0;j<s.length()-1;j++){
      String s2 = s.substring(j,j+2);
      if(s2.equals("50")){
        return true;
      }
    }
    return false;
  }
}
