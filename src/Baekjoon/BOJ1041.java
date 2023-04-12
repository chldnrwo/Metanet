package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

class BOJ1041 {
  public static void main(String[] args) {
    Scanner in  = new Scanner(System.in);

    long n = in.nextInt();
    long[][] arr = new long[2][3];
    long[] arr2 = new long[3];
    arr[0][0] = in.nextInt();
    arr[0][1] = in.nextInt();
    arr[0][2] = in.nextInt();
    arr[1][2] = in.nextInt();
    arr[1][1] = in.nextInt();
    arr[1][0] = in.nextInt();

    if(n==1){
      long sumOne =0;
      long max = 0;
        for(int i=0;i<2;i++){
          for(int j=0;j<3;j++){
            sumOne += arr[i][j];
            if(max<arr[i][j]){
              max = arr[i][j];
            }
          }
        }
        System.out.println(sumOne - max);
        return;
    }

    for (int i = 0; i < 3; i++) {
      arr2[i] = Math.min(arr[0][i], arr[1][i]);
    }
    Arrays.sort(arr2);

    long sum = 0;
    //3면
    long a = (arr2[0]+arr2[1]+arr2[2]) * 4;
    //2면
    long b = (arr2[0]+arr2[1])*(8*n-12);
    //1면
    long tmp = (n-2)*(n-1)*4 + (n-2)*(n-2);
    long c = arr2[0]*tmp;

    sum = a+b+c;
    //System.out.println(arr2[0]+" "+arr2[1]+" "+arr2[2]);
    //System.out.println(a+" "+b+" "+c);
    System.out.println(sum);
  }
}
/*
N이 1일때는 따로 구하기 5면

3면은 항상 4
2면은 항상 8n-12
1면은 (n-2)*(n-1)*4 + (n-2)*(n-2)

2의 경우, 총 8
4
4
0

3의 경우, 총 27
4
12
9

4의 경우, 총 64
4
20
28
 */
