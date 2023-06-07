package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

class BOJ14940 {
  static int n,m;
  static int[][] arr, res;
  static int[] ax = {-1,0,1,0};
  static int[] ay = {0,-1,0,1};
  public static void main(String[] args) throws IOException {
    //Scanner in = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    arr = new int[n][m];
    res = new int[n][m];

    for (int i = 0; i < n; i++){
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < m; j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for (int i = 0; i < n; i++){
      for (int j = 0; j < m; j++){
        if(arr[i][j]==2){
          bfs(i,j);
        }
      }
    }

    for (int i = 0; i < n; i++){
      for (int j = 0; j < m; j++){
        if(res[i][j]==0 && arr[i][j]==1){
          sb.append(-1+" ");
        }else{
          sb.append(res[i][j]+" ");
        }
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }
  public static void bfs(int i, int j){
    Deque<Pair> q = new LinkedList<>();
    res[i][j] = 0;
    q.offer(new Pair(i,j,0));
    while(!q.isEmpty()){
      Pair nex = q.poll();
      //System.out.println(nex.x+" "+nex.y+" "+nex.cnt);
      for(int k = 0; k < 4; k++){
        int nx = nex.x + ax[k];
        int ny = nex.y + ay[k];
        if(0<=nx && nx<n &&
            0<=ny && ny<m){
          if(arr[nx][ny]==1 && res[nx][ny]==0){
            res[nx][ny] = nex.cnt + 1;
            q.offer(new Pair(nx, ny, nex.cnt + 1));
          }
        }
      }
    }
  }
  static class Pair{
    int x;
    int y;
    int cnt;

    public Pair(int x, int y, int cnt) {
      this.x = x;
      this.y = y;
      this.cnt = cnt;
    }
  }
}
/*

1인데 못가는 곳은 -1 나와야됨

15 15
2 1 1 1 1 1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1 0 0 0 0 1
1 1 1 1 1 1 1 1 1 1 0 1 1 1 1
1 1 1 1 1 1 1 1 1 1 0 1 0 0 0
1 1 1 1 1 1 1 1 1 1 0 1 1 1 1

0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
3 4 5 6 7 8 9 10 11 12 13 14 15 16 17
4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
7 8 9 10 11 12 13 14 15 16 17 18 19 20 21
8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
9 10 11 12 13 14 15 16 17 18 19 20 21 22 23
10 11 12 13 14 15 16 17 18 19 20 21 22 23 24
11 12 13 14 15 16 17 18 19 20 0 0 0 0 25
12 13 14 15 16 17 18 19 20 21 0 29 28 27 26
13 14 15 16 17 18 19 20 21 22 0 30 0 0 0
14 15 16 17 18 19 20 21 22 23 0 31 32 33 34
 */