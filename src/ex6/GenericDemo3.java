package ex6;

import java.util.ArrayList;

public class GenericDemo3 {
  public static void main(String[] args) {
    ArrayList<Object> list = new ArrayList<Object>();
    list.add("123");
    list.add("A");
    list.add(true);
    list.add("abc");

    int res=0;
    if(list.get(0) instanceof Integer) {
      res = (int)list.get(0)+1;
    }else if(list.get(0) instanceof String) {
      res = Integer.parseInt((String)list.get(0))+1;
    }

    System.out.println(res);
  }
}
