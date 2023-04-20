package Baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class BOJ1045_final {
  static int N,M;
  static char[][] arr;
  static int[] parent,rank;
  static List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    int N = in.nextInt();
    int M = in.nextInt();
    arr = new char[N][N];

    PriorityQueue<Pair> pq = new PriorityQueue<>();


    for(int i = 0; i < N; i++) {
      String s = in.next();
      for(int j = i+1; j < N; j++) {
        if (s.charAt(j) == 'Y') {
          pq.offer(new Pair(i, j));
        }
      }
    }

    int cnt = 0;
    if(pq.size()>=M){
      int[] result = new int[N];
      parent = new int[N];
      rank = new int[N];

      for(int i = 0; i < N; i++){
        parent[i] = i;
        rank[i] = 1;
      }

      List<Pair> rem = new ArrayList<Pair>();

      while(!pq.isEmpty()){
        Pair p = pq.poll();
        int a = p.x;
        int b = p.y;

        if(union(a,b)){
          cnt++;
          result[b]++;
          result[a]++;
        }else{
          rem.add(p);
        }
      }
      if(cnt != N-1){
        System.out.println(-1);
      }else{
        int rcnt = M - cnt;

        for(int i = 0; i < rcnt; i++){
          Pair p = rem.get(i);
          result[p.x]++;
          result[p.y]++;
        }

        for(int i = 0; i < N; i++){
          System.out.print(result[i]+" ");
        }
      }
    } else{
      System.out.println(-1);
    }

  }
  static class Pair implements Comparable<Pair>{
    int x,y;
    public Pair(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override
    public int compareTo(Pair o) {
      if (this.x == o.x) {
        return this.y - o.y;
      }
      return this.x - o.x;
    }
  }
  public static boolean union(int x, int y){
    int rootX = find(x);
    int rootY = find(y);

    if(rootX==rootY){
      return false;
    }

    if(rank[rootX]>rank[rootY]){
      parent[rootY] = rootX;
    }else if(rank[rootX]<rank[rootY]){
      parent[rootX] = rootY;
    }else{
      parent[rootY] = rootX;
      rank[rootX]++;
    }
    return true;
  }

  public static int find(int x){
    if (parent[x] == x) {
      return x;
    }
    parent[x] = find(parent[x]);
    return parent[x];
  }
}
/*
1<=N<=50
N-1<=M<=1000

그래프이론/그리디/최소신장

 */
