package A;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main_Another{
  static int N, erase, root;
  static ArrayList<Integer>[] graph;
  static int[] leaf;
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    N = Integer.parseInt(br.readLine());

    st = new StringTokenizer(br.readLine());
    leaf = new int[N];

    graph = new ArrayList[N];
    for (int i = 0; i < N; i++) graph[i] = new ArrayList<>();


    for (int i = 0; i < N; i++) {
      int parent = Integer.parseInt(st.nextToken());
      if (parent == -1) root = i; // 루트는 부모가 없으니 -1로 주어진다!
      else graph[parent].add(i); // 각 노드의 자식들
    }

    erase = Integer.parseInt(br.readLine()); // 지울 노드

    solution();
  }
  static void solution() {
    for (int i = 0; i < N; i++) {
      graph[i].removeIf(integer -> integer == erase); // 그래프 안 지울 노드를 삭제하자!
    }

    if (erase != root) DFS(root, -1); // 루트를 지운다면 탐색할 필요는 없다!

    System.out.println(leaf[root]);
  }
  static void DFS(int x, int parent) {
    if (graph[x].isEmpty()) leaf[x] = 1; // 자식이 없다면 그 노드는 단말 노드다!

    for (int y : graph[x]) {
      if (y == parent) continue; // 위에서부터 내려왔으니 부모는 볼 필요가 없다!
      DFS(y, x);
      leaf[x] += leaf[y]; // if문에 의해 1이 누적되었으니 그 값을 부모에 누적하자!
    }
  }
}