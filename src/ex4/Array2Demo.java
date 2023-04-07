package ex4;

import java.util.Arrays;

public class Array2Demo {
  public static void main(String[] args) {
    String[] names = new String[3];
    names[0] = "Kim";
    names[1] = "Lee";
    names[2] = "Park";

    System.out.println(names);
    System.out.println(Arrays.toString(names));

    String[] names1 = {"Kim", "Lee", "Park"};
    System.out.println(Arrays.toString(names1));
  }
}