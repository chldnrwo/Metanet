package Baekjoon;

import java.util.Scanner;

class BOJ1193 {
  public static void main(String[] args) {
    Scanner in  = new Scanner(System.in);

    long n = in.nextInt();


      long cnt = 1;
      while(true){
         long rul = cnt*(cnt+1)/2;
         if(rul >= n){
          break;
         }
         cnt++;
      }
      //System.out.println(cnt);

      long b = n-cnt*(cnt-1)/2;
      long a = cnt+1-b;
      if(cnt%2==0){
        System.out.println(b+"/"+a);
      }else{
        System.out.println(a+"/"+b);
      }


  }
}
/*
제한 시간 보니까 dp
 */
