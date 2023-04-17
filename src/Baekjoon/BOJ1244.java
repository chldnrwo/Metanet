package Baekjoon;

import java.util.Scanner;

class BOJ1244 {
  static boolean[] arr;
  static int n;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    n = in.nextInt();
    arr = new boolean[n+1];
    for(int i=1;i<=n;i++){
      int a = in.nextInt();
      if(a==1){
        arr[i] = true;
      }else{
        arr[i] = false;
      }
    }
    int t = in.nextInt();
    for(int i=0;i<t;i++){
      int gen = in.nextInt();
      int num = in.nextInt();
      if(gen==1){
        boy(num);
      }else{
        girl(num);
      }
    }
    for(int i=1;i<=n;i++){

      if(arr[i]==false){
        sb.append(0).append(" ");
      }else{
        sb.append(1).append(" ");
      }

      if(i%20==0){
        sb.append("\n");
      }
    }
    System.out.println(sb);
  }
  public static void boy(int num){
    for(int i=num;i<=n;i+=num){
        arr[i] = !arr[i];
    }
  }
  public static void girl(int num){
    arr[num] = !arr[num];
    int left = num-1;
    int right = num+1;

    while(true){
      if(left<1||right>n){
        break;
      }
      if(arr[left]!=arr[right]){
        break;
      }

      arr[left] =!arr[left];
      arr[right] =!arr[right];

      left--;
      right++;
    }
  }
}
/*



 */
