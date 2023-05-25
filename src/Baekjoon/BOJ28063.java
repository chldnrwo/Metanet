package Baekjoon;

import java.util.Scanner;

class BOJ28063 {
  static boolean[][] arr;
  static int n,x,y;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    n = in.nextInt();
    x = in.nextInt();
    y = in.nextInt();

    arr = new boolean[n][n];
    x--;
    y--;
    if(n==1){
      System.out.println(0);
    }else if((x==0&&y==0) ||
        (x==n-1&&y==n-1) || (x==n-1&&y==0) || (x==0&&y==n-1)
    ){
      System.out.println(2);
    }else if(x==0 || y==0 || x==n-1 || y==n-1){
      System.out.println(3);
    }else{
      System.out.println(4);
    }


  }
}

