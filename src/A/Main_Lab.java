package A;

import java.util.Scanner;

public class Main_Lab {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int count = 0;

    for (int pos = 1; pos <= N; pos *= 10) {
      int left = N / (pos * 10);
      int current = (N / pos) % 10;
      int right = N % pos;

      if (pos > 1) {
        count += left * pos;
      } else {
        count += left * pos - left;
      }

      if (current == 1) {
        count += right + 1;
      } else if (current > 1) {
        count += pos;
      }
    }

    System.out.println(count);
  }
}
//이 방식은 시간복잡도 O(n)
//이전 방식의 경우 성공시킨다면 시간복잡도 O(logn)
