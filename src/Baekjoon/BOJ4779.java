package Baekjoon;

import java.util.Scanner;

public class BOJ4779 {
  static StringBuilder sb;
  static boolean[] arr;
  static int a;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);


    while(in.hasNext()) {
      sb = new StringBuilder();
      a = in.nextInt();
      int a3 = (int) Math.pow(3, a);
      arr = new boolean[a3];
      d(0, a3-1, 0);

      for(boolean check : arr) {
        if(!check) {
          sb.append("-");
        }else {
          sb.append(" ");
        }
      }
      System.out.println(sb);
    }

  }
  public static void d(int start, int end, int cnt) {
    if(cnt==a) {
      return;
    }

    int ch1 = start + (end-start+1) / 3 - 1;
    int ch2 = start + (end-start+1) * 2 / 3 - 1;



    for(int i=ch1+1;i<=ch2;i++) {
      arr[i] = true;
    }

    d(start, ch1, cnt+1);
    d(ch2+1 ,end, cnt+1);

  }
}
