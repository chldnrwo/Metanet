
package Baekjoon;

import java.util.Scanner;

class BOJ1333 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int second = in.nextInt();
    int phone = in.nextInt();



    int cnt=0;
    int music=0;
    int delay=0;
    boolean m = false;
    while(true){
      boolean p = false;
      if(music==second){
        music = 0;
        m = true;
      }
      if(delay==5){
        delay = 0;
        m = false;
      }

      if(cnt%phone==0){
        p = true;
      }
      if(cnt>(num*second+5*(num-1))){
        m = true;
      }
      if(p&&m){
        break;
      }
      if(m){
        delay++;
      }
      if(!m){
        music++;
      }
      cnt++;
    }
    System.out.println(cnt);
  }
}
/*
최악의 경우 num * second + 5*(num-1)


 */
