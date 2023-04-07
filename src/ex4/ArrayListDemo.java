package ex4;

import java.util.ArrayList;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(); // size = 0;
    System.out.println(list);
    System.out.println(list.size());
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    System.out.println(list);
    System.out.println(list.size());
    list.remove(0);
    list.remove(1);
    list.remove(2);
    list.remove(3);
    System.out.println(list);
    System.out.println(list.size());


  }
}