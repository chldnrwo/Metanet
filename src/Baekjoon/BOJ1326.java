
package Baekjoon;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

class BOJ1326 {
  static int n;
  static int[] arr;
  static boolean[] visit;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    n = in.nextInt();
    arr = new int[n+1];
    visit = new boolean[n+1];

    for(int i = 1; i <= n; i++){
      arr[i] = in.nextInt();
    }
    int a = in.nextInt();
    int b = in.nextInt();

    int res1 = bfs(a, b);

    System.out.println(res1);

  }
  public static int bfs(int a, int b){
    int cnt = 0;
    Deque<Pair> q = new LinkedList<>();
    visit[a] = true;
    q.offer(new Pair(a, cnt));

    while(!q.isEmpty()){
      Pair nex = q.poll();

      if(nex.num == b){
        return nex.count;
      }

      for(int i = nex.num; i <= n; i+=arr[nex.num]){
        if(visit[i]){
          continue;
        }
        visit[i] = true;

        q.offer(new Pair(i, nex.count+1));
      }

      for(int i = nex.num; i >= 1; i-=arr[nex.num]){
        if(visit[i]){
          continue;
        }
        visit[i] = true;

        q.offer(new Pair(i, nex.count+1));
      }
    }
    return -1;
  }
  static class Pair{
    int num;
    int count;

    public Pair(int num, int count) {
      this.num = num;
      this.count = count;
    }
  }
}
/*
음수 방향도 가능


 */
