package ex8.Chapter12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StreamDemo {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    Random r = new Random();

    for(int i = 0; i < 10; i++) {
      list.add(r.nextInt(30));
    }
    System.out.println("list"+list);
    List<Integer> gt10 = new ArrayList<>();
    for(int i : list) {
      if(i>10){
        gt10.add(i);
      }
    }
    System.out.println("10보다큰"+gt10);

    Collections.sort(gt10);
    System.out.println("정렬"+gt10);

    new Random().ints(0,30)
        .limit(10)
        .filter(s-> s>10)
        .distinct()
        .sorted()
        .forEach(System.out::println);

  }
}
