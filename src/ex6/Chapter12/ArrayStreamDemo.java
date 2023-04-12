package ex6.Chapter12;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStreamDemo {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    Stream<Integer> str = list.stream;
    IntStream stream = Arrays.stream(arr);

    Integer[] arr2 = {1,2,3};
    Stream<Integer> stream2 = Arrays.stream(arr2);

    String[] strArr = {"a","b","c","d"};
    Stream<String> stream3 = Arrays.stream(strArr);

    double[] arr3 = {1.1, 2.2, 3.3};
    DoubleStream.of(arr3);
  }
}
