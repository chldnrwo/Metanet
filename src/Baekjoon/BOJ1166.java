package Baekjoon;

import java.util.Scanner;

class BOJ1166 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int L = in.nextInt();
    int W = in.nextInt();
    int H = in.nextInt();

    double low = 0;
    double high = Math.min(H,Math.min(L,W));
    //고점은 L W H 중 최저값
    double mid;
    while(low<high){
      mid = (high+low)/2;
      //System.out.println(low+" "+mid+" "+high);
      if((long)(L/mid) * (long)(W/mid) * (long)(H/mid) <N){
        //모든 값들 정수형으로 변환
        if(mid == high){
          //이분 탐색 종료
          break;
        }
        high = mid;
      }else{
        if(low == mid){
          //이분 탐색 종료
          break;
        }
        low = mid;
      }

    }

    System.out.println(low);

  }
}
//이분 탐색 사용