package ex3;

public class ArrayDemo {
  public static void main(String[] args) {
    int[] scores = {100, 90, 80, 70, 95};
    int total = 0;
    for (int i = 0; i < scores.length; i++) {
      total += scores[i];
    }
    double average = total / (double) scores.length;

    System.out.println("total = " + total);
    System.out.println("average = " + average);
  }
}
