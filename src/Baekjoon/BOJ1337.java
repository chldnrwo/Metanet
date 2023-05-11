
package Baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class BOJ1337 {
  static int max = 4;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < n;i++) {
      int a = in.nextInt();
      list.add(a);
    }
    Collections.sort(list);
    int[] cnt = new int[n];
    for(int i = 0; i < n; i++) {
      for(int j=1;j<5;j++){
        if(!list.contains(list.get(i)+j)){
          cnt[i]++;
        }
      }
    }

    int min = cnt[0];
    for(int c : cnt){
      if(min>=c){
        min = c;
      }
    }
    System.out.println(min);

  }
}
/*
차이가 1
차이가 2
차이가 3
까지 유의미 나머진
컷


 */
