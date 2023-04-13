package Baekjoon;

import java.util.Scanner;

class BOJ1030_Fractal {
  static int[][] arr;
  static int N;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int s = in.nextInt(); //3
    N = in.nextInt(); //3
    int K = in.nextInt(); //1
    int R1 = in.nextInt(); //4
    int R2 = in.nextInt(); //11
    int C1 = in.nextInt(); //5
    int C2 = in.nextInt(); //10

    System.out.println("입력 완료");
    int rul = (int)Math.pow(N, s); // 27
    int rul2 = (K*rul)/N; // 9
    arr = new int[rul][rul];  // 27*27
    d(0, 0, rul, rul2);

    for(int i=0;i<rul;i++){
      for(int j=0;j<rul;j++){
        if(arr[i][j] == 1){
          System.out.print("■ ");
        }else{
          System.out.print("□ ");
        }
      }
      System.out.println();
    }
  }
  public static void d(int x, int y, int rul, int rul2){
    if(rul == 1){
      return;
    }
    System.out.println(x+" "+y+" "+rul+" "+rul2);
    System.out.println();
    for(int i=0;i<27;i++){
      for(int j=0;j<27;j++){
        if(arr[i][j] == 1){
          System.out.print("■ ");
        }else{
          System.out.print("□ ");
        }
      }
      System.out.println();
    }
    System.out.println();

    int a = (rul-rul2)/2; //9 시작
    int b = a+rul2-1; // 18 끝
    //System.out.println("a,b : "+a+" "+b);
    //System.out.println("x,y : "+x+" "+y);
    for(int i=a+x;i<=b+x;i++){
      for(int j=a+y;j<=b+y;j++){
        //System.out.println(i+" "+j);
        arr[i][j] = 1;
      }
    }

    for(int i=0;i<rul;i+=(rul/3)){
      for(int j=0;j<rul;j+=(rul/3)){
        d(i+x,j+y,((rul)/3), ((rul2)/3));
      }
    }
  }
}

