package Baekjoon;

import java.util.Scanner;

class BOJ1173 {
  static int N,M,m,T,R,st;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    N = in.nextInt();
    m = in.nextInt();
    M = in.nextInt();
    T = in.nextInt();
    R = in.nextInt();

    st = m;
    int cnt = 0;
    int exercise = 0;
    if((M-m) < T){
      System.out.println(-1);
      return;
    }

    while(true){
      if(exercise == N){
        break;
      }

      if(st+T>M){
        res();
      }else{
        ex();
        exercise++;
      }
      cnt++;
    }
    System.out.println(cnt);
  }
  public static void ex(){
    st+=T;
  }
  public static void res(){
    int st2 = st-R;
    st = Math.max(m,st2);
  }

}