package Baekjoon;

import java.util.Scanner;

class BOJ1145 {
  static int ruler = Integer.MAX_VALUE;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int[] arr = new int[5];
    for(int i=0;i<5;i++){
      arr[i] = in.nextInt();
    }

    for(int i=0;i<5;i++){
      for(int j=i+1;j<5;j++){
        for(int k=j+1;k<5;k++){
          //System.out.println(i+" "+j+" "+k);
          int c = c(c(arr[i],arr[j]),arr[k]);
          ruler = Math.min(ruler,c);
        }
      }
    }
    System.out.println(ruler);
  }
  public static int c(int a, int b){
    int r = euc(a,b);
    return a*b/r;
  }
  public static int euc(int a, int b){
    int r = a%b;
    if(r==0){
      return b;
    }
    return euc(b, r);
  }
}