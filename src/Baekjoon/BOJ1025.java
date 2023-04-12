package Baekjoon;

import java.util.Scanner;

class BOJ1025 {
  static int n,m,max;
  static String[][] arr;
  static boolean noSqrt = true;
  public static void main(String[] args) {
    Scanner in  = new Scanner(System.in);

    n = in.nextInt();
    m = in.nextInt();
    max = 0;
    arr = new String[n][m];
    for(int i = 0; i < n; i++) {
      String s = in.next();
      for(int j = 0; j < m; j++) {
        arr[i][j] = s.substring(j, j + 1);
      }
    }

    for(int i = 0; i < n; i++) {
      for(int j = 0; j < m; j++) {
        bru(i,j);
      }
    }
    if(noSqrt) {
      System.out.println(-1);
    }else{
      System.out.println(max);
    }

  }
  public static void bru(int i, int j){
    for(int k = -n; k < n; k++) { //x 등차
      for(int l = -m; l < m; l++) { //y 등차
        if(k==0&&l==0) continue;

        String t="";
        int i1 = i;
        int j1 = j;
        //System.out.println(i1+" "+j1);
        while(0<=i1 && i1<n && 0<=j1&& j1<m) {
          t = t+arr[i1][j1];
          //System.out.println(t);
          if(isSqrt(Integer.parseInt(t))){
            noSqrt = false;
            max = Math.max(max,Integer.parseInt(t));
          }
          i1 += k;
          j1 += l;
        }
      }
    }
    //System.out.println();
  }
  public static boolean isSqrt(long num){
    double a = Math.sqrt(num);
    if(a%1==0){
      return true;
    }
    return false;
  }
}

/*
메모리가 많진 않음

 */
