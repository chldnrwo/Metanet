package Baekjoon;

import java.util.Scanner;

class BOJ1236 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int M = in.nextInt();

    char[][] arr = new char[N][M];
    for(int i=0;i<N;i++){
      String s = in.next();
      for(int j=0;j<s.length();j++){
        arr[i][j] = s.charAt(j);
      }
    }
//    for(int i=0;i<N;i++){
//      for(int j=0;j<M;j++){
//        System.out.print(arr[i][j]+" ");
//      }
//      System.out.println();
//    }
    int cnt1 = 0;
    int cnt2 = 0;
    for(int i=0;i<N;i++){
      boolean flag = false;
      for(int j=0;j<M;j++){
        if(arr[i][j]=='X' && !flag){
          cnt1++;
          //System.out.println(i+" "+j);
          flag = true;
        }
      }
    }
    for(int j=0;j<M;j++){
      boolean flag = false;
      for(int i=0;i<N;i++){
        if(arr[i][j]=='X' && !flag){
          cnt2++;
          flag = true;
        }
      }
    }

    int a = Math.max(N-cnt1,M-cnt2);
    System.out.println(a);
  }
}
/*



 */
