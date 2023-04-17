package Baekjoon;

import java.util.*;

class BOJ1033 {
  static long n;
  static long[] arr;
  static boolean[] visit;
  static List<ArrayList<Point>> list = new ArrayList<ArrayList<Point>>();
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    n = in.nextLong();
    arr = new long[(int) n];

    for(int i = 0; i < n; i++){
      list.add(new ArrayList<Point>());
    }
    for(int i = 0; i < n-1; i++){
      long a = in.nextInt();
      long b = in.nextInt();
      long c = in.nextInt();
      long d = in.nextInt();

      long r = euc(c,d);
      c/=r;
      d/=r;

      list.get((int) a).add(new Point(b,c));
      list.get((int) b).add(new Point(a,d));
    }
    for(int i = 0; i < n; i++){
      arr[i] = bfs(i);
    }
    long gcd=arr[0];
    for(int i = 1; i < n; i++){
      gcd = euc(arr[i],gcd);
    }
    //System.out.println(gcd);

    for(int i = 0; i < n; i++){
      arr[i] /= gcd;
      sb.append(arr[i]).append(" ");
    }
    System.out.println(sb);
  }
  public static long bfs(long num){
    Deque<Integer> q = new LinkedList<>();
    visit = new boolean[(int) n];
    visit[(int) num] = true;
    q.offer((int) num);
    int cnt = 1;
    while(!q.isEmpty()){
      int n = q.poll();

      for(Point p : list.get(n)){
        if(visit[(int) p.end]){
          continue;
        }
        visit[(int) p.end] = true;

        cnt *= p.weight;
        q.offer((int) p.end);
      }
    }
    return cnt;
  }
  public static long euc(long a, long b){
    long r = a%b;
    if(r==0){
      return b;
    }
    return euc(b,r);
  }
  public static long lcm(long a, long b){
    long r = euc(a,b);
    return a*b/r;
  }
  static class Point{
    long end;
    long weight;

    public Point(long end, long weight) {
      this.end = end;
      this.weight = weight;
    }
  }
}

/*
long도 안됨


 */
