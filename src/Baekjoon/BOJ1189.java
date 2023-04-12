package Baekjoon;

import java.util.Scanner;

class BOJ1189 {
  static int R,C,K, total;
  static char[][] arr;
  static boolean[][] visited;
  static int[] ax = {-1,0,1,0};
  static int[] ay = {0,-1,0,1};
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    R = in.nextInt();
    C = in.nextInt();
    K = in.nextInt();

    arr = new char[R][C];
    visited = new boolean[R][C];
    total = 0;
    for(int i = 0; i < R; i++) {
      String s = in.next();
      for(int j = 0; j < C; j++){
        arr[i][j] = s.charAt(j);
      }
    }
//    for(int i = 0; i < R; i++) {
//      for(int j = 0; j < C; j++){
//        System.out.print(arr[i][j]+" ");
//      }
//      System.out.println();
//    }

    dfs(R-1, 0, 1);
    System.out.println(total);
  }
  public static void dfs(int i, int j, int cnt) {
    //System.out.println(i+" "+j+" "+cnt);
    if(cnt == K && i == 0 && j == C-1) {
      total++;
      //System.out.println();
      return;
    }

    visited[i][j] = true;
    for(int k = 0; k < 4; k++) {
      int nex = i+ax[k];
      int ney = j+ay[k];
      //System.out.println(nex + " " +ney);
      if(0<=nex && nex<R && 0<=ney && ney<C){
        if(!visited[nex][ney]&&!(arr[nex][ney]=='T')){
          dfs(nex,ney,cnt+1);
        }
      }
    }
    visited[i][j] = false;
  }
}
