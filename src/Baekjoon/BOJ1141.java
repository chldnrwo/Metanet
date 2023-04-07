package Baekjoon;

import java.util.*;

class BOJ1141 {
  static String[] arr;
  static Set<String> set;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    set = new HashSet<>();

    int n = in.nextInt();
    arr = new String[n];
    for(int i = 0;i<n;i++) {
      arr[i] = in.next();
    }
    Arrays.sort(arr, (s1, s2) -> {
      if(s1.length()== s2.length()) {
        return s1.compareTo(s2);
      }
      return s2.length() - s1.length();
    });

    //System.out.println(Arrays.toString(arr));
    set.add(arr[0]);
    for(int i = 1;i<n;i++) {
      if(check(arr[i])){
        set.add(arr[i]);
      }
    }
    System.out.println(set.size());
  }
  public static boolean check(String s1){
    Iterator<String> iter = set.iterator();
    while(iter.hasNext()) {
      String s2 = iter.next();
      String s3 = s2.substring(0, s1.length());
      if(s1.equals(s3)){
        return false;
      }
    }
    return true;
  }
}