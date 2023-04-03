package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

class BOJ1064 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double[] arr = new double[3];
    double[] x = new double[5];
    double[] y = new double[5];

    for(int i=0;i<3;i++){
      x[i] = in.nextDouble();
      y[i] = in.nextDouble();
    }
    x[3] = x[0];
    y[3] = y[0];
    x[4] = x[1];
    y[4] = y[1];

    double a1 = (x[2]-x[1]) * (y[1]-y[0]);
    double b1 = (x[1]-x[0]) * (y[2]-y[1]);

    if(a1==b1){
      System.out.println(-1.0);
      return;
    }

    for(int i=0;i<3;i++){
      double sum=0;
      double a = Math.pow((x[i+1] - x[i]), 2) + Math.pow((y[i+1] - y[i]), 2);
      double b = Math.sqrt(a);
      double c = Math.pow((x[i+2] - x[i+1]), 2) + Math.pow((y[i+2] - y[i+1]), 2);
      double d = Math.sqrt(c);
      sum+=2*b;
      sum+=2*d;
      arr[i] = sum;
    }
    Arrays.sort(arr);

    //System.out.println(Arrays.toString(arr));
    System.out.println(arr[2]-arr[0]);
  }
}