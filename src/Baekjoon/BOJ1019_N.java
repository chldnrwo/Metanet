package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1019_N {
  static int count = 1;
  static int page[] = new int[10];;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int B = Integer.parseInt(br.readLine());
    int A = 1;

    while(A <= B) { //1부터 B까지 가는 여정
      while(B % 10 != 9 && A <= B) {
        cal(B);
        B--;
      }

      while(A % 10 != 0 && A <= B) {
        cal(A);
        A++;
      }

      if(A > B) {
        break;
      }

      A /= 10;
      B /= 10;

      for(int i = 0; i < 10; i++) {
        page[i] += (B - A + 1)*count;
      }
      //System.out.println(Arrays.toString(page));
      count *= 10;
    }

    for(int i = 0; i < 10; i++) {
      System.out.print(page[i]+" ");
    }
  }

  public static void cal(int cur) {
    //System.out.print(cur+" ");
    while(0 < cur) {
      page[cur % 10] += count;
      cur /= 10;
    }
    //System.out.println(Arrays.toString(page));
  }
}