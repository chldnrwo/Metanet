package Baekjoon;

import java.util.Scanner;

class BOJ1138 {
  static int[] arr, res;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int t = in.nextInt();
    arr = new int[t];
    res = new int[t];
    for(int i=0;i<t;i++){
      arr[i] = in.nextInt();
    }
    for(int i=0;i<t;i++){
      int a = check(arr[i]);
      while(true){
        if(res[a]==0){
          res[a] = i+1;
          break;
        }else{
          a++;
        }
      }
      //System.out.println(Arrays.toString(res));
    }
    for(int i=0;i<res.length;i++){
      System.out.print(res[i]+" ");
    }
  }
  public static int check(int num){
    int cnt = 0;
    int ans = -1;
    for(int i=0;i<res.length;i++){
      if(cnt == num){
        ans = i;
        break;
      }
      if(res[i]==0){
        cnt++;
      }
    }

    return ans;
  }
}
//왼쪽에 0이 몇갠지