package Baekjoon;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

class BOJ1039 {
  static int N,len,K;
  static int result = -1;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    N = in.nextInt();
    len = Integer.toString(N).length();
    K = in.nextInt();

    bfs();

    System.out.println(result);
  }
  public static void bfs(){
    Deque<Pair> q = new LinkedList<>();
    boolean[][] visit = new boolean[1_000_001][K+1];
    q.offer(new Pair(N,0));
    visit[N][0] = true;

    while(!q.isEmpty()){
      Pair p = q.poll();
      if(p.cnt == K){
        result = Math.max(result,p.num);
        continue;
      }

      for(int i = 0; i<len; i++){
        for(int j = i+1; j<len;j++){
          int r = swap(p.num,i,j);

          if(r!=-1 && !visit[r][p.cnt+1]){
            q.offer(new Pair(r, p.cnt+1));
            visit[r][p.cnt+1] = true;
          }
        }
      }
    }
  }
  static class Pair{
    int num;
    int cnt;
    public Pair(int num, int cnt) {
      this.num = num;
      this.cnt = cnt;
    }
  }
  public static int swap(int n, int i, int j){
    int[] arr = new int[len];
    for(int k = len-1; k >=0; k--){
      arr[k] = n%10;
      n/=10;
    }
    if(i==0 && arr[j]==0){ // i가 무조건 j보다 작아서 상관없다.
      return -1;
    }
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;

    int sum = arr[0];
    for(int k = 1; k<len; k++){
      sum = sum*10+arr[k];
    }
    return sum;
  }
}
/*
N 최대 1_000_000
K 최대 10
최악의 경우 (1_000_000)^10의 경우가 존재

그리디로 안됨, 완전 탐색으로 가야된다
핵심은
1. visit가 2차원 배열일것
2. 0이 앞에 오는 사태를 막을 것
3. visit을 통해 중복되는 계산을 최소화 할 것
4. 끝내는 조건이 return이 아니라 continue를 계속 줘서
끝까지 다보게 해야된다.

 */
