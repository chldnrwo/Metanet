package Baekjoon;

import java.util.Scanner;

class BOJ1233 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int S1 = in.nextInt();
    int S2 = in.nextInt();
    int S3 = in.nextInt();

    int[] arr = new int[S1+S2+S3+1];
    for (int i=1; i <= S1; i++) {
      for(int j=1;j<=S2;j++){
        for(int k=1;k<=S3;k++){
          arr[i+j+k]++;
        }
      }
    }
    int max = 0;
    int maxIdx = -1;
    for(int i=0;i<arr.length;i++){
      if(max < arr[i]){
        max = arr[i];
        maxIdx = i;
      }
    }
    System.out.println(maxIdx);

  }
}
/*



 */
