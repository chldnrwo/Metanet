
package Baekjoon;

import java.util.Scanner;

class BOJ1091 {
  static int n;
  static int[] P,S;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    n = in.nextInt();
    int[] arr = new int[n];
    int[] origin = new int[n];
    P = new int[n];
    S = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = i%3;
      origin[i] = arr[i];
      P[i] = in.nextInt();
    }
    for(int i = 0; i < n; i++){
      S[i] = in.nextInt();
    }

    int cnt = 0;

    while(true){
      if(check(arr, P)){
        System.out.println(cnt);
        break;
      }

      arr = reRoll(arr);
      cnt++;
      if(check(arr, origin)){
        System.out.println(-1);
        break;
      }
    }




  }
  public static boolean check(int[] arr1, int[] arr2){
    for(int i = 0; i < n; i++){
      if(arr1[i] != arr2[i]){
        return false;
      }
    }
    return true;
  }
  public static int[] reRoll(int[] arr){
    int[] tmp = new int[S.length];
    for(int i = 0; i < S.length; i++){
      int s = S[i];
      tmp[i] = arr[s];
    }
    return tmp;
  }
  public static int[] goal(int[] arr){
    int[] tmp = new int[P.length];
    for(int i = 0; i < P.length; i++){
      int p = P[i];
      tmp[p] = i;
    }
    return tmp;
  }
}
/*



 */
