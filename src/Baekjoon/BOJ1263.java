package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

class BOJ1263 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    Pair[] arr = new Pair[N];
    for(int i = 0;i<N;i++){
      int t = in.nextInt();
      int s = in.nextInt();
      arr[i] = new Pair(t,s);
    }
    Arrays.sort(arr, (s1, s2)->{
      if(s1.b == s2.b){
        return s2.a - s1.a;
      }
      return s2.b - s1.b;
    });
    int min = arr[0].b-arr[0].a;
    for(int i = 1; i < N ; i++){

      min = Math.min(min,arr[i].b);
      min = min - arr[i].a;
    }

    if(min>0){
      System.out.println(min);
    }else{
      System.out.println(-1);
    }
  }
  static class Pair{
    int a;
    int b;

    public Pair(int a, int b) {
      this.a = a;
      this.b = b;
    }
  }
}
/*
0시부터 시작
최대한 늦잠 잘 수 있게

마감시간이 같다면 일단 짧은거 먼저

끝마칠 수 없는 경우를 생각 안했었음
 */
