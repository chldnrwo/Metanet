package Baekjoon;

import java.util.*;

class BOJ1302 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    Map<String, Integer> map = new HashMap<>();

    for(int i = 0; i < n; i++) {
      String s = in.next();
      if(map.containsKey(s)){
        map.replace(s, map.get(s)+1);
      }else{
        map.put(s, 1);
      }
    }
    List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

    Collections.sort(list, (s1, s2) -> {
      if(s1.getValue() == s2.getValue()){
        return s1.getKey().compareTo(s2.getKey());
      }
      return s2.getValue().compareTo(s1.getValue());
    });

    System.out.println(list.get(0).getKey());
  }
}
/*



 */
