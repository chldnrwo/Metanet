package ex6.Chapter11.exercise;

import java.util.HashMap;
import java.util.Map;

public class Test5 {
  public static void main(String[] args) {
    Map<String,String> map = Map.of("호랑이","tiger","표범","leopard","사자","lion");
    Map<String,String> map2 = new HashMap<String, String>(map);

    System.out.println("변경 전 : "+map2);
    map2.replaceAll((k,v)->v.toUpperCase());
    System.out.println("변경 후 : "+map2);
  }
}
