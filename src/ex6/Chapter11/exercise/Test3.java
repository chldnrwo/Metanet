package ex6.Chapter11.exercise;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
    Map<String, Integer> map = new Hashtable<>();
    Scanner in = new Scanner(System.in);
    map.put("김열공", 80);
    map.put("최고봉", 90);
    map.put("우등생", 95);
    map.put("나자바", 88);

    System.out.print("이름을 입력하세요 : ");
    String s = in.nextLine();
    System.out.println(map.get(s));
  }
}
