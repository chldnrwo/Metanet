package Baekjoon;

import java.util.Scanner;

class BOJ1105 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int L = in.nextInt();
    int R = in.nextInt();

    int cnt = Integer.MAX_VALUE;

    for(int i=L;i<=R;i++){
      if(cnt==0){
        break;
      }
      String s = Integer.toString(i);
      int cnt2=0;
      for(int j=0;j<s.length();j++) {
        if (s.charAt(j) == '8') {
          cnt2++;
        }
      }
      cnt = Math.min(cnt, cnt2);
    }
    System.out.println(cnt);
  }
}
// L ~ R 사이에서 '8'이 가장 적게 들어갈때
// int 범위를 넘어가기에 브루트포스로는 힘들어 보인다
