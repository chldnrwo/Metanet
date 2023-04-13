package ex8.Chapter12;

import java.util.Optional;

public class Optional2 {
  public static void main(String[] args) {
    String s = null;
    //System.out.println(Optional.of(s).get());

    Optional<String> opt = Optional.ofNullable(s);

    if (opt.isPresent()) {
      System.out.println(opt.get());
    } else {
      System.out.println("Value is null");
    }
  }
}
