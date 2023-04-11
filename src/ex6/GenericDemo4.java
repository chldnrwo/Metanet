package ex6;

import java.util.ArrayList;

public class GenericDemo4 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
//    list.add("123");
//    list.add(2.0);
    //list.add(true);
    int res = list.get(0)+1;
    System.out.println(res);

  }
}
