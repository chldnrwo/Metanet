package Baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BOJ1045_실패 {
  static int N,M;
  static char[][] arr;
  static List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    int N = in.nextInt();
    int M = in.nextInt();
    arr = new char[N][N];
    int cnt = M;

    for(int i = 0; i < N; i++) {
      String s = in.next();
      for(int j = 0; j < N; j++) {
        arr[i][j] = s.charAt(j);
      }
    }
    for(int i = 0; i < N; i++) {
      list.add(new ArrayList<Integer>());
    }
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < N; j++) {
        if(i<j && arr[i][j]=='Y'){
          if(cnt==0){
            break;
          }
          list.get(i).add(j);
          list.get(j).add(i);
          cnt--;
        }
      }
    }

    if(cnt>0){
      System.out.println(-1);
      System.exit(0);
    }
    for(int i = 0; i < N; i++){
      if(list.get(i).isEmpty()){
        System.out.println(-1);
        System.exit(0);
      }
      sb.append(list.get(i).size()+" ");
    }
    System.out.println(sb);
  }
}
/*
1<=N<=50
N-1<=M<=1000

그래프이론/그리디/최소신장

 */
