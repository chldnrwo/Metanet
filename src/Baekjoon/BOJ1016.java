package Baekjoon;

import java.util.Scanner;

class BOJ1016 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    long min = in.nextLong();
    long max = in.nextLong();

    boolean[] check = new boolean[2000000];
    long fin = (long) Math.sqrt(max);
    //max 밑의 제곱수 중에 가장 큰 값
    for (long i = 2; i < fin + 1; i++) {
      long temp = i * i;

      long start = 0;
      if (min % temp == 0) {
        start = min / temp;
      } else {
        start = min / temp + 1;
      }
      //min울 제곱수로 나누었을 때, 조건을 만족하는 가장 작은 몫

      for (long j = start; j * temp < max + 1; j++) {
        check[(int) ((j * temp) - min)] = true;
      }


    }
    long cnt = 0;
    for(long i = 0;i<max-min+1;i++) {
      if(!check[(int)i]) {
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
/*
1 o
2 o
3 o
4 x
5 o
6 o
7 o
8 x
9 x
10 o
*/