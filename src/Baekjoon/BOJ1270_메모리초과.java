package Baekjoon;

import java.util.*;

class BOJ1270_메모리초과 {
  static StringBuilder sb = new StringBuilder();
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    for (int i = 0; i < n; i++) {
      int total = in.nextInt();

      Map<Long, Integer> map = new HashMap<>(total);
      for (int j = 0; j < total; j++) {
        long a = in.nextLong();
        if (map.containsKey(a)) {
          map.replace(a, map.get(a) + 1);
        } else {
          map.put(a, 1);
        }
      }

      List<Long> ks = new ArrayList<>(map.keySet());
      ks.sort((s1, s2) -> map.get(s2).compareTo(map.get(s1)));


      if (map.get(ks.get(0)) < (double) total / 2) {
        sb.append("SYJKGW").append("\n");
      } else if (map.get(ks.get(0)) == (double) total / 2
          || map.get(ks.get(0)) == map.get(ks.get(1))) {
        sb.append("SYJKGW").append("\n");
      } else {
        sb.append(ks.get(0)).append("\n");
      }


    }
    System.out.println(sb);
  }

  static class Pair {
    int num;
    int cnt;

    public Pair(int num, int cnt) {
      this.num = num;
      this.cnt = cnt;
    }
  }
}
