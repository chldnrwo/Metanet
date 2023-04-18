package Baekjoon;

import java.util.*;

class BOJ1043 {
  static int N,M,cnt;
  static int[] parent;
  static boolean[] wArr;
  static boolean[] visited;
  static List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    N = in.nextInt();
    M = in.nextInt();
    cnt = 0;
    parent = new int[N+1];
    int wise = in.nextInt();
    wArr = new boolean[N+1];

    for(int i = 1; i <= wise; i++){
      int a = in.nextInt();
      wArr[a] = true;
    }
    //System.out.println(Arrays.toString(wArr));
    for(int i = 0; i <= N+M; i++){
      list.add(new ArrayList<Integer>());
    }
    visited = new boolean[N+M+1];
    for(int party = 1; party <= M; party++){
      int a = in.nextInt();
      int p = N+party;
      for(int i = 1; i <= a; i++){
        int b = in.nextInt();
        list.get(p).add(b);
        list.get(b).add(p);
        //System.out.println(a+" "+b);
      }
    }
//    for(int i = 1; i <= N+M; i++){
//      System.out.println(list.get(i));
//    }
    for(int i = 1; i <= N; i++){
      if(wArr[i]) bfs(i);
    }
    System.out.println(M-cnt);
  }
  public static void bfs(int num){
    Deque<Integer> q = new LinkedList<>();
    q.offer(num);

    visited[num] = true;
    while(!q.isEmpty()){
      int n = q.poll();
      if(n>N) cnt++;

      for(int ne : list.get(n)){
        if(visited[ne]) continue;
        visited[ne] = true;

        q.offer(ne);
      }
    }
  }
}
/*
분리집합 == 유니온 파인드
0일 경우 파티 수만큼 거짓말 가능
거짓을 듣고 다른 파티에서 진실을 듣는 상황도 일어나선 안됨
파티이름은 100단위 수로 하고 100단위 체크다하고 전체 파티수 - 체크된 파티수
4 5
1 1
1 1
1 2
1 3
1 4
2 4 1

visit를 위쪽에서 한번만 초기화 했어야됐다.
 */
