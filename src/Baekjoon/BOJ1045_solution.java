package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class BOJ1045_solution {
  static int[] make_set;
  static int[] ranks;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().split(" ");
    int N = Integer.parseInt(input[0]);
    int M = Integer.parseInt(input[1]);

    PriorityQueue<Edge> edge_list = new PriorityQueue<>();

    for (int x = 0; x < N; x++) {
      String temp = br.readLine();
      for (int y = x + 1; y < N; y++) {
        if (temp.charAt(y) == 'Y') {
          edge_list.offer(new Edge(x, y));
        }
      }
    }

    int city_cnt = 0;
    if (edge_list.size() >= M) {
      int[] result = new int[N];
      make_set = new int[N];
      ranks = new int[N];

      for (int i = 0; i < N; i++) {
        make_set[i] = i;
        ranks[i] = 1;
      }

      List<Edge> remain_list = new ArrayList<>();

      while (!edge_list.isEmpty()) {
        Edge edge = edge_list.poll();
        int node_a = edge.a;
        int node_b = edge.b;

        if (union(node_a, node_b)) {
          city_cnt++;
          result[node_b]++;
          result[node_a]++;
        } else {
          remain_list.add(edge);
        }
      }

      if (city_cnt != N - 1) {
        System.out.println(-1);
      } else {
        int remain_cnt = M - city_cnt;

        for (int i = 0; i < remain_cnt; i++) {
          Edge edge = remain_list.get(i);
          result[edge.a]++;
          result[edge.b]++;
        }

        for (int i = 0; i < N; i++) {
          System.out.print(result[i] + " ");
        }
      }
    } else {
      System.out.println(-1);
    }
  }

  static int find_parents(int X) {
    if (X == make_set[X]) {
      return X;
    }
    make_set[X] = find_parents(make_set[X]);
    return make_set[X];
  }

  static boolean union(int x, int y) {
    int X = find_parents(x);
    int Y = find_parents(y);

    if (X != Y) {
      if (ranks[X] < ranks[Y]) {
        int temp = X;
        X = Y;
        Y = temp;
      }
      make_set[Y] = X;
      if (ranks[X] == ranks[Y]) {
        ranks[X]++;
      }
      return true;
    }
    return false;
  }

  static class Edge implements Comparable<Edge> {
    int a;
    int b;

    public Edge(int a, int b) {
      this.a = a;
      this.b = b;
    }

    @Override
    public int compareTo(Edge o) {
      if (this.a == o.a) {
        return this.b - o.b;
      }
      return this.a - o.a;
    }
  }
}
