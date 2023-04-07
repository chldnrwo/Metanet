package Baekjoon;

import java.util.Scanner;

class BOJ1079 {
  static int[][] sin;
  static int n,mapia;
  static int maxN = 0;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    n = in.nextInt();

    int[] arr = new int[n];
    boolean[] killed = new boolean[n];
    for(int i = 0; i < n; i++){
      arr[i] = in.nextInt();
    }

    sin = new int[n][n];
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        sin[i][j] = in.nextInt();
      }
    }
    mapia = in.nextInt();
    boolean day;
    if(arr.length%2!=0){
      day=true;
    }else{
      day=false;
    }
    dfs(arr,0,day,killed);
    System.out.println(maxN);
  }
  public static void dfs(int[] arr, int night, boolean day, boolean[] killed){
    if(killed[mapia]){
//      System.out.println("END");
//      System.out.println();
//      System.out.println();
      maxN = Math.max(maxN, night);
      return;
    }

    if(day){
      int maxIndex = 0;
      for(int i=0;i<arr.length;i++){
        if(!killed[i]){
          maxIndex = i;
          break;
        }
      }
      for(int i=0;i<arr.length;i++){
        if(arr[maxIndex]<arr[i] && !killed[i]){
          maxIndex = i;
        }
      }
      killed[maxIndex] = true;
      //System.out.println(Arrays.toString(killed));
      //System.out.println(Arrays.toString(arr));
      //System.out.println("DAY KILL : " + (maxIndex));
      //System.out.println();
      dfs(arr, night, false, killed);
      killed[maxIndex] = false;
    }else{
      night++;
      for(int i=0;i<arr.length;i++){
        if(arr[i]!=0 && i!=mapia && !killed[i]){
          for(int j=0;j<arr.length;j++){
            arr[j] += sin[i][j];
          }
          boolean[] newKilled = killed.clone();
          killed[i] = true;
          //System.out.println(Arrays.toString(killed));
          //System.out.println(Arrays.toString(newArr));
          //System.out.println("NIGHT KILL : " + (i));
          //System.out.println();
          dfs(arr, night, true, killed);
          killed[i] = false;
          for(int j=0;j<arr.length;j++){
            arr[j] -= sin[i][j];
          }
        }
      }
    }

  }

}
/*
가정이 다 글러먹음 참가자는 0부터
4
500 500 500 500
1 4 3 -2
-2 1 4 3
3 -2 1 4
4 3 -2 1
1

0을 죽일 경우
501 504 503 498
1이 낮에 죽고 끝

2을 죽일 경우
503 498 501 504
낮에 3가 죽게됨
밤에 0죽이고
낮에 1 끝

3을 죽일 경우
*/