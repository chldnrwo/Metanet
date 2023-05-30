package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

class BOJ2309 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int[] arr = new int[9];
    int sum = -100;
    for(int i=0;i<9;i++){
      arr[i] = in.nextInt();
      sum += arr[i];
    }
    Arrays.sort(arr);

    for(int i=0;i<9;i++){
      for(int j=i+1;j<9;j++){
          if(arr[i]+arr[j]==sum){
            for(int k=0;k<9;k++){
              if(k!=i && k!=j){
                System.out.println(arr[k]);
              }
            }
            System.exit(0);
          }
      }
    }


  }
}
/*



 */
