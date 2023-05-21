package Baekjoon;

import java.util.Scanner;
//마름모 구현하고 돌림, 메모리 초과
class BOJ1262_메모리초과 {
  static char[][] arr;
  static int len;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int r1 = in.nextInt();
    int c1 = in.nextInt();
    int r2 = in.nextInt();
    int c2 = in.nextInt();
    len = n*2-1;
    arr = new char[len][len];

    for(int i=0;i<len;i++){
      for(int j=0;j<len;j++){
        arr[i][j] = '.';
      }
    }

    for(int i=0;i<n-1;i++){
      char c = (char)(n+96);
      for(int j=(n-1)-i;j<n+i;j++) {

        arr[i][j] = c;
        if(j<n-1){
          c--;
        }else{
          c++;
        }

      }
    }

    for(int i=n-1;i<len;i++){
      char c = (char)(n+96);
      for(int j=i-(n-1);j<len+(n-1)-i;j++) {
        arr[i][j] = c;
        if(j<n-1){
          c--;
        }else{
          c++;
        }
      }
    }

//    for(int i=0;i<len;i++){
//      for(int j=0;j<len;j++){
//        System.out.print(arr[i][j]+" ");
//      }
//      System.out.println();
//    }

    res(n,r1,c1,r2,c2);
  }
  public static void res(int n, int r1, int c1, int r2, int c2){
    StringBuilder sb = new StringBuilder();

    for(int i=r1; i<=r2; i++){
      for(int j=c1; j<=c2; j++) {
        int a = i%len;
        int b = j%len;
        sb.append(arr[a][b]);
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }

}
/*
분할정복은 아니라고함
ㄴ그냥 싹다 구현하면됨

n이 1인 경우 총공간 1
n이 2인 경우 총공간 9
n이 3인 경우 총공간 25

n이 n인 경우 총공간 (2n-1)^2 필요
제일 위에 찍히는 알파벳은 n번째 알파벳

1. z이후 다시 a로 윤회
2.

 */
