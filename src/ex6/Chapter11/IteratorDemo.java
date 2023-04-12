package ex6.Chapter11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
  public static void main(String[] args) {
    Collection<String> list = Arrays.asList("a", "b", "c", "d", "e", "f");

    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    Iterator<String> iterator2 = list.iterator();
    while (iterator2.hasNext()) {
      System.out.println(iterator2.next());
    }
    while (iterator2.hasNext()) {
      System.out.println(iterator2.next());
    }
  }
}
