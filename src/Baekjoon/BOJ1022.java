package Baekjoon;

import java.util.Scanner;

class BOJ1022 {
  static int[][] arr;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int r1=in.nextInt();
    int c1=in.nextInt();
    int r2=in.nextInt();
    int c2=in.nextInt();

    arr = new int[r2-r1+1][c2-c1+1];
    int max = 0;

    for(int i=r1;i<=r2;i++){
      for(int j=c1;j<=c2;j++){
        arr[i-r1][j-c1] = cal(i,j);
        max = Math.max(max, arr[i-r1][j-c1]);
      }
    }

    StringBuilder formatter = new StringBuilder("%");
    formatter.append(String.valueOf(max).length());
    formatter.append("d ");

    for(int i=0; i<=r2-r1; i++){
      for(int j=0; j<=c2-c1; j++){
        System.out.printf(formatter.toString(), arr[i][j]);
      }
      System.out.println();
    }

  }
  public static int cal(int r, int c){
    int border = Math.max(Math.abs(r), Math.abs(c));
    int min = (int) Math.pow(2*border-1,2)+1;

    if(r==border){
      return min + 7*border -1 + c;
    }
    if(c==-border){
      return min + 5*border -1 + r;
    }
    if(r==-border){
      return min + 3*border -1 - c;
    }
    return min + border -1 - r;
  }
}

//4분할