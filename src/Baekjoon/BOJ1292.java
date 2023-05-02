package Baekjoon;

import java.util.Scanner;

class BOJ1292 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b = in.nextInt();
    int[] arr = new int[1001];
    int cnt = 0;
    int idx = 1;
    while(true){
      if(cnt > 1000){
        break;
      }
      int id = 0;
      while(id!=idx){
        if(cnt > 1000){
          break;
        }
        arr[cnt] = idx;
        cnt++;
        id++;
      }
      idx++;
    }

    int sum = 0;
    for(int i = a-1; i <= b-1; i++){
      sum+=arr[i];
      //System.out.println(arr[i]);
    }
    System.out.println(sum);

  }
}
/*
1000정도면 걍 시뮬 돌려도 될거같은데


 */