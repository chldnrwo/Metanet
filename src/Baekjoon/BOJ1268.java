package Baekjoon;

import java.util.Scanner;

class BOJ1268 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[][] arr = new int[n][5];
    boolean[][] check = new boolean[n][n];
    for(int i=0; i<n; i++) {
      for(int j=0; j<5; j++) {
        arr[i][j] = in.nextInt();
      }
    }
    for(int t=0; t<n; t++) {
      for(int i=0; i<n; i++) {
        for(int j=0; j<5; j++) {
          if(arr[t][j] == arr[i][j]){
            if(t==i){
              continue;
            }
            check[t][i] = true;
          }
        }
      }
    }

    int[] banjang = new int[n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(check[i][j]){
          banjang[i]++;
        }
      }
    }
    //System.out.println(Arrays.toString(banjang));
    int max = 0;
    int idx = 0;
    for(int i=0;i<n;i++){
      if(max<banjang[i]){
        max = banjang[i];
        idx = i;
      }
    }
    System.out.println(idx+1);
  }
}
/*



 */
