package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

class BOJ2920 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int[] arr = new int[8];
    int[] asd = {1,2,3,4,5,6,7,8};
    int[] des = {8,7,6,5,4,3,2,1};
    for(int i = 0; i < arr.length; i++){
      arr[i] = in.nextInt();
    }
    if(Arrays.equals(arr, asd)){
      System.out.println("ascending");
    }else if(Arrays.equals(arr, des)){
      System.out.println("descending");
    }else{
      System.out.println("mixed");
    }


  }
}
/*



 */