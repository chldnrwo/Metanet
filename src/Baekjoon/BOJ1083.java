package Baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class BOJ1083 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Integer[] arr = new Integer[n];
    Integer[] arr2 = new Integer[n];
    for(int i = 0; i < n; i++){
      arr[i] = in.nextInt();
      arr2[i] = arr[i];
    }
    int s = in.nextInt();
    Arrays.sort(arr2, Collections.reverseOrder());
    //System.out.println(Arrays.toString(arr));
    //System.out.println(Arrays.toString(arr2));
    int cnt = 0;
    while(true){
      if(s < 1 || Arrays.equals(arr, arr2)) {
       break;
      }

      int idx = -1;
      for(int i = cnt; i < n; i++){
        if(arr2[cnt]==arr[i]){
          idx = i;
          break;
        }
      }
     // System.out.println(s+" "+idx+" "+cnt);

      if(idx-cnt>s || idx == -1){
        int max = arr[cnt];
        int idx2 = cnt;
        for(int i = cnt; i <= cnt+s; i++){
          if(arr[i]>max){
            max = arr[i];
            idx2 = i;
          }
        }
        if(max==arr[cnt] && idx2 == cnt){
          cnt++;
          //System.out.println(Arrays.toString(arr));
          continue;
        }
//        System.out.println(s+" "+idx2+" "+cnt);
        s-=(idx2-cnt);
        int tmp = arr[idx2];
        for(int i = idx2-1 ; i >= cnt ; i--){
          arr[i+1] = arr[i];
        }
        arr[cnt] = tmp;
      }else{
        s-=(idx-cnt);
        int tmp = arr[idx];
        for(int i = idx-1 ; i >= cnt ; i--){
          arr[i+1] = arr[i];
        }
        arr[cnt] = tmp;
      }
      cnt++;
      //System.out.println(Arrays.toString(arr));
    }
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }

  }
}
/*
s가 1000000이라 브루트 포스로는 못품
교환은 근접한 원소끼리만 가능

 */
