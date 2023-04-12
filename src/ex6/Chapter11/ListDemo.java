package ex6.Chapter11;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    String[] animals1 = new String[] {"dog", "cat", "bird"};
    List<String> list = Arrays.asList(animals1); //고정크기 반환
    list.set(1,"tiger"); //변경 가능 추가 x

    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    list.sort((s1, s2) -> s1.length() - s2.length());

    Iterator<String> iterator2 = list.iterator();
    while (iterator2.hasNext()) {
      System.out.println(iterator2.next());
    }


    List<String> animals2 = List.of("dog", "cat", "bird");
    //animals2.set(1,"tiger"); // immutable 수정 추가 둘다 불가

  }
}
