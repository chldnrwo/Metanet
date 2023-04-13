package ex8.Chapter12;

import java.util.stream.Stream;

public class SkipDemo {
  public static void main(String[] args) {
    Stream.of("a1","b1","b2","c1","c2","c3")
        .filter(s->s.startsWith("c"))
        .skip(1) //n개 건너뛰어라
        .forEach(s->System.out.println(s));

  }

}
