package A;

import java.util.Arrays;
import java.util.Scanner;

class Main_Another{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();

    int[] arr = new int[10];
    for(int i=1;i<=N;i++){
      String s = Integer.toString(i);
      for(int j=0;j<s.length();j++){
        int a = s.charAt(j) - 48;
        arr[a]++;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}
//일일이 셀 경우 시간초과