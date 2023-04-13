package Baekjoon;

import java.util.Scanner;

class BOJ1030 {
  static char[][] arr = new char[51][51];  // 최대값
  static int N,K,R1,R2,C1,C2;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int s = in.nextInt(); //3
    N = in.nextInt(); //3
    K = in.nextInt(); //1
    R1 = in.nextInt(); //4
    R2 = in.nextInt(); //11
    C1 = in.nextInt(); //5
    C2 = in.nextInt(); //10

    int rul = (int)Math.pow(N, s); // 27
    d(0, 0, rul, false);

    for(int i=0;i<=R2-R1;i++){
      for(int j=0;j<=C2-C1;j++){
        sb.append(arr[i][j]);
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }
  public static void d(int x, int y, int rul, boolean isBlack){
    if(x > C2 || x+rul <= C1|| y > R2 || y+rul <= R1){
      return;
    }
    if(rul == 1){
      arr[y-R1][x-C1] = isBlack? '1': '0';
      return;
    }

    int nSize = rul/N;
    int blackStart = (N-K)/2; //9 시작
    int blackEnd = N-blackStart; // 18 끝

    for(int i=0; i<N; i++){
      int nY = y+nSize*i;
      for(int j=0; j<N; j++){
        int nX = x+nSize*j;
        d(nX,nY,nSize, isBlack || (i >= blackStart && i < blackEnd) && (j >= blackStart && j < blackEnd));
      }
    }
  }
}

/*
아마 다 그릴 경우 초과 발생
*/
