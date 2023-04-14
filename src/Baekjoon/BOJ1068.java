package Baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BOJ1068 {
  static int cnt2 = 0;
  static int target;
  static int start,n;
  static List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
  static int[] result;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    n = in.nextInt();
    int[] arr = new int[n];
    result = new int[n];

    for(int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    target = in.nextInt();

    for(int i = 0; i < n; i++) {
      list.add(new ArrayList<Integer>());
    }
    for(int i = 0; i < n; i++) {
      int parent = arr[i];
      int child = i;
      if(parent == -1){ // 루트는 부모가 없으니 -1로 주어진다!
        start = i;
        continue;
      }
      list.get(parent).add(child); // 각 노드의 자식들
    }

    solution();
  }
  public static void solution(){
    for (int i = 0; i < n; i++) {
      list.get(i).removeIf(integer -> integer == target); // 그래프 안 지울 노드를 삭제하자!
    }

    if(target != start){
      dfs(start, -1); // 루트를 지운다면 탐색할 필요는 없다!
    }

    System.out.println(result[start]);
  }
  public static void dfs(int t, int parent){

      if(list.get(t).isEmpty()){
        result[t]=1; // 자식이 없다면 그 노드는 단말 노드다!
      }

      for(int a : list.get(t)){
        if(a == parent){
          continue; // 위에서부터 내려왔으니 부모는 볼 필요가 없다!
        }
        dfs(a, t);
        result[t] += result[a]; // if문에 의해 1이 누적되었으니 그 값을 부모에 누적하자!
      }
    }

}
/*
그래프이론으로 풀이가능
키워드 :
DFS,
단방향,
루트 리프노드 - 타겟 리프 노드
※자식 노드 다 없앨 때 리프노드가 되는 경우
ㄴ부모는 하나만 존재한다
 */
