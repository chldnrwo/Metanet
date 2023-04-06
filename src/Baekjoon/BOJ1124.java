package Baekjoon;

import java.util.Scanner;

class BOJ1124 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b = in.nextInt();
    int cnt = 0;
    for(int i=a;i<=b;i++){
      if(sosu(soinsu(i))){
        cnt++;
      }
    }
    System.out.println(cnt);
  }
  public static boolean sosu(int num){
    if(num == 1){
      return false;
    }

    for(int i=2;i*i<=num;i++){
      if(num%i==0){
        return false;
      }
    }
    return true;
  }
  public static int soinsu(int i){
    int cnt=0;
    int ruler=2;
    while(true){
      if(i==1){
        break;
      }

      if(i%ruler==0){
        i/=ruler;
        cnt++;
      }else{
        ruler++;
      }
    }
    //System.out.println(cnt);
    return cnt;
  }
}
//소수 체크
//소인수분해
/*
2
3
2 2
5
2 3
7
2 2 2
3 3
2 5
*/