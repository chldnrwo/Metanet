package A;

import java.util.Scanner;

class Main_Another{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[][] box = new int[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        box[i][j] = scanner.nextInt();
      }
    }
    scanner.close();

    int minMoves = Integer.MAX_VALUE;

    for (int jokerBox = 0; jokerBox < n; jokerBox++) {
      int moves = 0;
      for (int color = 0; color < m; color++) {
        int totalCards = 0;
        int maxCardsInBox = 0;
        for (int boxIndex = 0; boxIndex < n; boxIndex++) {
          if (boxIndex == jokerBox) {
            continue;
          }
          totalCards += box[boxIndex][color];
          maxCardsInBox = Math.max(maxCardsInBox, box[boxIndex][color]);
        }
        moves += (totalCards - maxCardsInBox);
      }
      minMoves = Math.min(minMoves, moves);
    }

    System.out.println(minMoves);
  }
}
