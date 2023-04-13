package Baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class BOJ1038 {
  static List<Long> list = new ArrayList<Long>();
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    for(int i = 0;i<10;i++){
      bp(i,1);
    }

    Collections.sort(list); //9876543210까지 넣어 놓고 정렬

    if(n<10){ //10이하는 바로 반환
      System.out.println(n);
    }else if(n>1022){ //9876543210이 1021번째
      System.out.println(-1);
    }else{
      System.out.println(list.get(n));
    }


  }
  public static void bp(long num, int idx){
    if(idx > 10){ //11자리 수는 존재 x
      return;
    }
    //System.out.println(num);
    list.add(num);

    for(int i=0;i<num%10;i++){
      bp(i+(num*10),idx+1);
    }

  }
}
/*



*/