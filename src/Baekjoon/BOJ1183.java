package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

class BOJ1183 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int[] arr = new int[N];
    for(int i = 0; i < N; i++){
        int a = in.nextInt();
        int b = in.nextInt();
        arr[i] = a-b;
    }
    Arrays.sort(arr);

    if(N%2==1){
      System.out.println(1);
    }else{
        int a = arr[N/2] - arr[N/2-1] + 1;
      System.out.println(a);
    }

  }
}