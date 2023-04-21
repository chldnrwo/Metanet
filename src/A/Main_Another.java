package A;

import java.util.Arrays;
import java.util.Scanner;

public class Main_Another {
  static int answer; // 해답
  static String input; // 입력값
  static int[][] dp = new int[50][50]; //최대 길이

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    input = in.next();

    for (int i = 0; i < 50; i++) {
      Arrays.fill(dp[i], -1); // dp[][]배열을 -1로 초기화
    }
    answer = solve(0, input.length() - 1);
    //최대 left right solve에 던지기

    for (int i = 0; i < input.length() - 1; i++) {
      for (int j = i + 1; j < input.length(); j++) {
        // i가 j보다 항상 작은 모든 다른 경우의 수
        for (int k = 0; k < 50; k++) {
          Arrays.fill(dp[k], -1);
        }// 일단 매번 -1로 초기화

        char[] chars = input.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        input = String.valueOf(chars);
        //문자열을 char배열로 바꾸고 i번째와 j번째를 바꿈


        answer = Math.min(answer,
            solve(0, input.length() - 1) + 1);
        //바뀐 input으로 다시 answer 비교 이경우 4번 연산이라
        //cost 1이 추가됨

        temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        input = String.valueOf(chars);
        //다시 원상복귀
      }
    }
    System.out.println(answer);
  }
  static int solve(int left, int right) {
    // 왼쪽 끝과 오른쪽 끝을 의미하는 변수가 를어오면 연산 처리하는 dp 메소드
    // 방식은 top-down 재귀 방식
    if (dp[left][right] != -1) return dp[left][right];
    // 이미 값이 나온 dp면 바로 반환
    if (left >= right) return 0;
    // 왼족끝이 오른쪽 끝과 같아지거나 초과하면 함수를 끝냄
    dp[left][right] // dp[left][right]=-1이었을 경우 값을 정하는 식
    = Math.min(
        Math.min(
            solve(left + 1, right) + 1,
            //dp[left+1][right]의 값 + 1, 왼쪽에서 한칸 줄은 문자열의 최소 팰린드롬
            solve(left, right - 1) + 1),
            //dp[left][right-1]의 값 + 1, 오른쪽에서 한칸 줄은 문자열의 최소 팰린드롬
            //둘중 하나가 되면 2번 연산하면됨
          
        solve(left + 1, right - 1)
        //dp[left+1][right-1]의 값 + 1, 양쪽에서 한칸 줄은 문자열의 최소 팰린드롬
        + (input.charAt(left) != input.charAt(right) ? 1 : 0)
          //left와 right가 같으면 0 아니면 1, 이것이 3번째 연산에 해당됨
    );
    // 세 가지 경우 중 가장 minor한 값이 dp[left][right]에 들어간다.
    return dp[left][right];
  }
}

/*
다이나믹 프로그래밍(아마 2차원 ijk까진 안씀)
브루트포스 알고리즘

이미 팰린드롬이면 0 출력

1. 문자열의 어떤 위치에 어떤 문자를 삽입 (시작과 끝도 가능)
2. 어떤 위치에 있는 문자를 삭제
3. 어떤 위치에 있는 문자를 교환
  ㄴ하나의 문자를 어떤 문자로든 변경
4. 서로 다른 문자를 교환(1번만 가능)
  ㄴ두 개의 문자의 위치를 바꿈
*/