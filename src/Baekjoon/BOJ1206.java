package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class BOJ1206 {
  static int[] arr;
  static int n;
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    arr = new int[n];
    for(int i = 0; i < n; i++) {
      String[] input = br.readLine().split("\\.");
      StringBuilder sb = new StringBuilder();
      sb.append(input[0]).append(input[1]);
      arr[i] = Integer.parseInt(sb.toString());
    }

    for(int i = 1; i <= 1000; i++){
      if(isPos(i)){
        System.out.println(i);
        System.exit(0);
      }
    }

  }
  public static boolean isPos(int i){
    for(int j = 0; j < n; j++){
      int start = 0;
      int end = 10 * i;
      boolean check = false;

      while(start <= end){
        int sum = (start + end) / 2;
        int avg = (sum * 1000) / i;

        //System.out.println(avg+" "+arr[j]);
        if(arr[j] == avg){
          if(avg >10*1000){
            continue;
          }
          check = true;
          break;
        }else if(arr[j] < avg){
          end = (sum -1);
        }else{
          start = (sum + 1);
        }
      }
      if(!check){
        return false;
      }
    }
    return true;
  }
}
/*



 */
