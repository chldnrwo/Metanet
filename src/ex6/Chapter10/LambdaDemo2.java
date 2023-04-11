package ex6.Chapter10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaDemo2 {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("a", "b", "c", "d", "e");
    Collections.sort(list, (s1, s2) -> s2.compareTo(s1));
    System.out.println(list);
  }
}
