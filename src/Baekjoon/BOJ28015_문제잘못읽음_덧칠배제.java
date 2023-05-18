
package Baekjoon;

import java.util.Scanner;

class BOJ28015_문제잘못읽음_덧칠배제 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int m = in.nextInt();
    int[][] arr = new int[n][m];

    for(int i = 0; i < n; i++){
      for(int j = 0; j < m; j++){
        arr[i][j] = in.nextInt();
      }
    }
    int cnt = 0;

    for(int i = 0; i < n; i++){
      int now = arr[i][0];
      if(arr[i][0]!=0){
       // System.out.println(i+" "+0);
        cnt++;
      }
      for(int j = 0; j < m; j++){
        if(arr[i][j] == now){
          continue;
        }else if(arr[i][j]==0){
          now = arr[i][j];
        }else{
         //System.out.println(i+" "+j);
          now = arr[i][j];
          cnt++;
        }
      }
    }
    System.out.println(cnt);
  }
}
/*



 */
