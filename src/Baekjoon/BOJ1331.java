
package Baekjoon;

import java.util.Scanner;

class BOJ1331 {
  static int[] ax = {-2,-1,1,2,-2,-1,1,2};
  static int[] ay = {1,2,2,1,-1,-2,-2,-1};
  static boolean[][] visit = new boolean[6][6];
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String[] knight = new String[36];
    for(int i=0 ;i<36; i++){
      knight[i] = in.next();
    }

    for(int i=0 ;i<35; i++){
      String s = knight[i].substring(1,2);
      char c = knight[i].charAt(0);
      int num = Integer.parseInt(s);

      String s1 = knight[i+1].substring(1,2);
      char c1 = knight[i+1].charAt(0);
      int num1 = Integer.parseInt(s1);

      visit[(int)(c-65)][num-1] = true;
      if(visit[(int)(c1-65)][num1-1]){
        System.out.println("Invalid");
        System.exit(0);
      }else if(!check(c, num, c1, num1)){
        System.out.println("Invalid");
        System.exit(0);
      }
    }
    char c = knight[35].charAt(0);
    int num = Integer.parseInt(knight[35].substring(1,2));

    char c1 = knight[0].charAt(0);
    int num1 = Integer.parseInt(knight[0].substring(1,2));

    if(!check(c, num, c1, num1)){
      System.out.println("Invalid");
    }else{
      System.out.println("Valid");
    }

  }
  public static boolean check(char c, int num, char c1, int num1){
    for(int i = 0 ; i<8 ; i++){
      char nc = (char) (c+ax[i]);
      int nnum = num+ay[i];
      if(nc == c1 && nnum == num1){
        return true;
      }
    }
    return false;
  }
}
/*
올바른가?
1 나이트가 갈 수 있는 위치인지
2 이미 갔던 곳을 또 방문하는 경우

 */
