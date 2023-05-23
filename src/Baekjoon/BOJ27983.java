package Baekjoon;

import java.util.Scanner;

class BOJ27983 {
  static int cnt = 0;
  static int n;
  static int[] xArr;
  static int[] lArr;
  static String[] cArr;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    n = in.nextInt();
    xArr = new int[n];
    lArr = new int[n];
    cArr = new String[n];
    for(int i=0;i<n;i++){
     xArr[i] = in.nextInt();
    }
    for(int i=0;i<n;i++){
      lArr[i] = in.nextInt();
    }
    for(int i=0;i<n;i++){
      cArr[i] = in.next();
    }

    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        check(i,j);
      }
    }
    System.out.println("NO");
  }
  public static void check(int i, int j){
    int tmp = Math.abs(xArr[i] - xArr[j]);
    int tmp2 = lArr[i] + lArr[j];
    if(tmp <= tmp2 && !cArr[i].equals(cArr[j])){
      System.out.println("YES");
      System.out.println((i+1)+" "+(j+1));
      System.exit(0);
    }
  }
}
/*
N 갯수 2
X 수직선의 점 1 3
L 길이 1 1
C 리본 색 Y R

|x1 - x2| <= L1 + L2
C1 != C2
 */
