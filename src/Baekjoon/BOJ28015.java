
package Baekjoon;

import java.util.Scanner;

class BOJ28015 {
  static int cnt;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    cnt = 0;
    int n = in.nextInt();
    int m = in.nextInt();
    String[][] arr = new String[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = in.next();
      }
    }
    int sum = 0;
    for (int i = 0; i < n; i++) {
      String s = "";
      for (int j = 0; j < m; j++) {
        if(!arr[i][j].equals("0")){
          s += arr[i][j];
        }else{
          sum+=Math.min(oneCheck(s), twoCheck(s));
          s = "";
        }
      }
      sum+=Math.min(oneCheck(s), twoCheck(s));
    }
    System.out.println(sum);
  }
  public static int twoCheck(String s) {
    if(s.equals("")){
      return 0;
    }
    int cnt = 1;
    char now = s.charAt(0);

    if (now == '2') {
      cnt++;
    }

    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == '2' && now != '2') {
        cnt++;
      }
      now = s.charAt(i);
    }

    return cnt;
  }
  public static int oneCheck(String s) {
    if(s.equals("")){
      return 0;
    }
    int cnt = 1;
    char now = s.charAt(0);

    if (now == '1') {
      cnt++;
    }

    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == '1' && now != '1') {
        cnt++;
      }
      now = s.charAt(i);
    }

    return cnt;
  }
}
/*
0제외하고 2로 칠하고 1로 덧칠
vs
0제외하고 1로 칠하고 2로 덧칠


 */
