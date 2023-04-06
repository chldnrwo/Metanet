package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

class BOJ1027 {
  static int[] arr;
  static int n;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    n = in.nextInt();
    arr = new int[n];
    int[] res = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    for(int i = 0; i < n-1; i++) {
      //System.out.println(checkR(i));
      res[i]+=checkR(i);
    }
    for(int i = 1; i < n; i++) {
      //System.out.println(checkL(i));
      res[i]+=checkL(i);
    }
    Arrays.sort(res);
    System.out.println(res[res.length-1]);
  }
  public static int checkR(int num){
    int cnt = 1;
    double g = (double)(arr[num+1] - arr[num]) / 1;

    for(int i = num+2; i < n; i++){
      double tmp = (double)(arr[i] - arr[num]) / (i-num);
      if(tmp > g){
        g = tmp;
        cnt++;
      }
    }
    return cnt;
  }
  public static int checkL(int num){
    int cnt = 1;
    double g = (double)(arr[num] - arr[num-1]) / 1;

    for(int i = num-2; i >= 0; i--){
      double tmp = (double)(arr[num] - arr[i]) / (num-i);
      if(tmp < g){
        g = tmp;
        cnt++;
      }
    }
    return cnt;
  }
}