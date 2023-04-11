package ex6.Chapter10.sec1;

import java.util.Arrays;

public class ComparableDemo {
  public static void main(String[] args) {
    Rectangle[] rectangles = {new Rectangle(10, 20),
        new Rectangle(30, 40),
        new Rectangle(50, 60)};
    Arrays.sort(rectangles, (r1, r2) -> r1.getArea() - r2.getArea());;

    Integer[] integers = {1, 2, 3, 4, 5};
    Arrays.sort(integers);
    System.out.println(Arrays.toString(integers));

    for(Rectangle r : rectangles) {
      System.out.println(r);
    }
  }
}
