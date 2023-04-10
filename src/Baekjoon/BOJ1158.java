package Baekjoon;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class BOJ1158 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int K = in.nextInt();

    Deque<Integer> q = new LinkedList<>();
    List<Integer> list = new LinkedList<>();

    for (int i = 1; i <= N; i++) {
      q.offer(i);
    }

    while(!q.isEmpty()){
      for(int i=0;i<K-1;i++){
        int a = q.poll();
        q.offer(a);
      }
      int a = q.poll();
      list.add(a);
    }

    String s = list.toString();
    s = s.substring(1,s.length()-1);
    s = "<"+s+">";
    System.out.println(s);

  }
}