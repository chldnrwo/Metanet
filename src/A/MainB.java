package A;

import java.util.Scanner;
import java.util.HashMap;

public class MainB {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    scanner.nextLine();

    String[] table = new String[N];
    for (int i = 0; i < N; i++) {
      table[i] = scanner.nextLine();
    }

    HashMap<Character, Integer> alphabetCounts = new HashMap<>();
    for (char c = 'A'; c <= 'Z'; c++) {
      alphabetCounts.put(c, 0);
    }

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        char c = table[i].charAt(j);
        alphabetCounts.put(c, alphabetCounts.get(c) + 1);
      }
    }

    for (char c = 'A'; c <= 'Z'; c++) {
      alphabetCounts.put(c, alphabetCounts.get(c) * (N - 1) * (M - 1));
    }

    for (char c = 'A'; c <= 'Z'; c++) {
      System.out.println(c + ": " + alphabetCounts.get(c));
    }

    scanner.close();
  }
}
