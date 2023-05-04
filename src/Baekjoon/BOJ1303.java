
package Baekjoon;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

class BOJ1303 {
  static char[][] arr;
  static boolean[][] check;
  static int[] ax = {-1, 0, 1, 0};
  static int[] ay = {0, -1, 0, 1};
  static int n,m;
  static int black=0;
  static int white=0;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    m = in.nextInt();
    n = in.nextInt();
    arr = new char[n][m];

    for(int i = 0; i < n; i++) {
      String s = in.next();
      for(int j = 0; j < m; j++) {
        arr[i][j] = s.charAt(j);
      }
    }
    check = new boolean[n][m];
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < m; j++) {
        if(arr[i][j]=='B'){
          bfsB(i,j);
        }else{
          bfsW(i,j);
        }
      }
    }
    System.out.println(white+" "+black);
  }
  public static void bfsB(int i, int j){
    if(check[i][j]){
      return;
    }
    int cnt = 0;
    Deque<Pair> q = new LinkedList<>();
    check[i][j] = true;
    cnt++;

    q.offer(new Pair(i, j));

    while(!q.isEmpty()){
      Pair next = q.poll();
      int x = next.x;
      int y = next.y;
      //System.out.println(x+" "+y);
      for(int k = 0; k < 4; k++){
        int nx = x + ax[k];
        int ny = y + ay[k];
        if(0<=nx&&nx<n
            &&0<=ny&&ny<m){
          if(arr[nx][ny]=='B'){
            if(check[nx][ny]){
              continue;
            }
            check[nx][ny] = true;
            q.offer(new Pair(nx, ny));
            cnt++;
          }

        }
      }
    }
    //System.out.println(cnt);
    black += (cnt * cnt);
  }
  public static void bfsW(int i, int j){
    if(check[i][j]){
      return;
    }
    int cnt = 0;
    Deque<Pair> q = new LinkedList<>();
    check[i][j] = true;
    cnt++;

    q.offer(new Pair(i, j));

    while(!q.isEmpty()){
      Pair next = q.poll();
      int x = next.x;
      int y = next.y;
      //System.out.println(x+" "+y);
      for(int k = 0; k < 4; k++){
        int nx = x + ax[k];
        int ny = y + ay[k];
        if(0<=nx&&nx<n
            &&0<=ny&&ny<m
            &&arr[nx][ny]=='W'){
          if(check[nx][ny]){
            continue;
          }
          check[nx][ny] = true;
          q.offer(new Pair(nx, ny));
          cnt++;
        }
      }
    }
    //System.out.println(cnt);
    white += (cnt * cnt);
  }
  static class Pair{
    int x;
    int y;

    public Pair(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

}
/*
메모리가 많지 않ㅇ므

5 5
WBWWW
WWWWW
BBBBB
BBBWW
WWWWW

B : 1+64
W : 81+49

 */
