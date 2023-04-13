package ex8.Chapter12;

import java.util.Arrays;
import java.util.stream.Stream;

public class Map2Demo {
  public static void main(String[] args) {
    Nation[] nations = new Nation[3];
    nations[0] = new Nation("Afghanistan",100);
    nations[1] = new Nation("Albania",200);
    nations[2] = new Nation("Algeria",300);

    Stream<Nation> stream = Arrays.stream(nations);
    stream.filter(nation-> nation.getPopulation() >= 200)
        .map(Nation::getName)
        .forEach(System.out::println);

  }
}
