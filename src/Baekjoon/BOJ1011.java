package Baekjoon;

import java.util.Scanner;

class BOJ1011 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int t = in.nextInt();
    for(int i=0;i<t;i++){
      int a = in.nextInt();
      int b = in.nextInt();

      int c = Math.abs(a-b);

      double d = Math.sqrt(c);
      int e;
      if(d%1==0){
        e = (int)(d*2)-1;
      }else{
        e = (int)(d*2);
      }
      System.out.println(e);
    }

  }
}
//위로 가는건 문제가 없다
//밑으로 가는 건?