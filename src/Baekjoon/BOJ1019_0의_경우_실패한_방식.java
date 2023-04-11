package Baekjoon;

import java.util.Scanner;

class BOJ1019_0의_경우_실패한_방식 {
  static int N;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    N = in.nextInt();
    long[] arr = new long[10];
    for(long i=1;i<=9;i++){
      long a = notZero(i);
      arr[(int)i] = a;
    }
    arr[0] = Zero(0);
    for(int i=0;i<=9;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static long notZero(long num){
    long cnt = 0;
    for(int i=1; i<=N;i*=10){ // 1,10,100,1000,10000.....
      long a = (N/(i*10))*i;
      cnt += a;
      //3이 i 자릿수 에서 나타나는 경우들
      long b = Math.min(Math.max(N%(i*10)-i*num+1, 0), i);
      cnt += b;
    }
    return cnt;
  }
  public static long Zero(long num){
    long cnt = 0;

    for(int i=10; i<=N;i*=10){ // 1,10,100,1000,10000.....
      long a = (N/(i*10))*i;
      cnt += a;
    }

    return cnt;
  }
}
//일일이 셀 경우 시간초과
/*
10진수의 각 자릿수마다 한 자릿수 k가 나타날 확률은 1/10
각 자릿수에 대해 k의 개수를 모두 더함



*/