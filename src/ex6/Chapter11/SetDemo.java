package ex6.Chapter11;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
  public static void main(String[] args) {
    Set<String> set = Set.of("a", "b", "c", "d", "e", "f");
    System.out.println(set);
    new TreeSet<String>().addAll(set);

  }
}
