package Baekjoon;

import java.util.*;

class Main{
  static int N,M,K;
  static List<ArrayList<Point>> list = new ArrayList<ArrayList<Point>>();
  static long[][] dp;
  static long max = Long.MAX_VALUE;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    N = in.nextInt(); //도시
    M = in.nextInt(); //도로
    K = in.nextInt(); //포장 할 도로의 수

    dp = new long[N + 1][K + 1];

    for(int i = 0; i <= N; i++){
      list.add(new ArrayList<Point>());
      Arrays.fill(dp[i], max);
    }


    for(int i = 1; i <= M; i++){
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();

      list.get(a).add(new Point(b, c, 0));
      list.get(b).add(new Point(a, c, 0));
    }

    dist();

//    for(int i = 0; i <= N; i++){
//      for(int j = 0; j <= K; j++){
//        System.out.print(dp[i][j]+" ");
//      }
//      System.out.println();
//    }
      long min = max;
      for(long a : dp[N]){
        min = Math.min(min, a);
      }
    System.out.println(min);
  }
  public static void dist(){
    PriorityQueue<Point> pq = new PriorityQueue<Point>(Comparator.comparingLong(o->o.weight));
    pq.offer(new Point(1, 0, 0));
    dp[1][0] = 0;

    while(!pq.isEmpty()){
      Point n = pq.poll();
      if(n.weight > dp[n.end][n.cnt])continue;
      for(Point l : list.get(n.end)){
        long nexCost = n.weight + l.weight;
        if(nexCost < dp[l.end][n.cnt]){
          dp[l.end][n.cnt] = nexCost;
          pq.add(new Point(l.end, nexCost, n.cnt));
        }
        if(n.cnt < K && n.weight < dp[l.end][n.cnt + 1]){
          dp[l.end][n.cnt + 1] = n.weight;
          pq.add(new Point(l.end, n.weight, n.cnt + 1));
        }
      }
    }
  }
}
class Point{
  int end;
  long weight;
  int cnt;

  public Point(int end, long weight, int cnt) {
    this.end = end;
    this.weight = weight;
    this.cnt = cnt;
  }
}
//다익스트라