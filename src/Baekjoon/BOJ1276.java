package Baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class BOJ1276 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int cnt = 0;
    int n = in.nextInt();
    List<Pair> list = new ArrayList<Pair>();

    for(int i = 0; i <n; i++){
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      list.add(new Pair(a,b,c-1));
    }
    Collections.sort(list);

    for(int i=0; i<n; i++) {
      Pair p = list.get(i);

      for(int j=i-1; j>=-1; j--) {

        if(j==-1) {
          cnt += p.y;
          //System.out.println("im 1 : "+cnt);
          break;
        }
        Pair q = list.get(j);
        if(p.x1>=q.x1 && p.x1<=q.x2) {
          cnt += (p.y-q.y);
          //System.out.println("im 2 : "+cnt);
          break;
        }
      }

      for(int j=i-1; j>=-1; j--) {
        if(j==-1) {
          cnt += p.y;
          //System.out.println("im 3 : "+cnt);
          break;
        }
        Pair q = list.get(j);
        if(p.x2>=q.x1 && p.x2<=q.x2) {
          cnt += (p.y-q.y);
          //System.out.println("im 4 : "+cnt);
          break;
        }
      }
    }
    System.out.println(cnt);
  }
  static class Pair implements Comparable<Pair>{
    int y;
    int x1;
    int x2;

    public Pair(int y, int x1, int x2) {
      this.y = y;
      this.x1 = x1;
      this.x2 = x2;
    }

    @Override
    public int compareTo(Pair o) {
      return this.y - o.y;
    }
  }
}
/*
5
50 50 90
40 40 80
30 30 70
20 20 60
10 10 50

정렬 후 교각 꽂을수 잇는지

꽂힌 교각 중에 제일 높은거에 꽂기
 */
