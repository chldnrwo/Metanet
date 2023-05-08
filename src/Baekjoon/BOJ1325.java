
package Baekjoon;

import java.util.*;

class BOJ1325 {
  static List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
  static int n, m;
  static int max = 0;
  static List<Integer> result = new ArrayList<Integer>();
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    n = in.nextInt();
    m = in.nextInt();

    for (int i = 0; i <= n; i++) {
      list.add(new ArrayList<Integer>());
    }
    for (int i = 0; i < m; i++) {
      int a = in.nextInt();
      int b = in.nextInt();
      list.get(b).add(a);
    }
    for (int i = 1; i <= n; i++) {
      bfs(i);
    }
    for(int a : result){
      System.out.print(a+" ");
    }
  }
  public static void bfs (int num) {
    int cnt = 0;
    Deque<Integer> q = new LinkedList<>();
    boolean[] visit = new boolean[n+1];
    visit[num] = true;
    q.offer(num);

    while(!q.isEmpty()){
      int n = q.poll();

      for(int i : list.get(n)){
        if(visit[i]){
          continue;
        }
        visit[i] = true;
        cnt++;
        q.offer(i);
      }
    }
    //System.out.println(cnt);
    if(cnt > max){
      max = cnt;
      result = new ArrayList<>();
      result.add(num);
    }else if(cnt == max){
      result.add(num);
    }
  }
}
/*
5 4
3 1
3 2
4 3
5 3

1 2

? 널포인트 에러
 */
