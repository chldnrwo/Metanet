package Baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class BOJ1251 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    List<String> list = new ArrayList<String>();
    String s = in.next();

    for(int i = 1; i < s.length(); i++) {
      for(int j = i+1; j < s.length(); j++) {
        String s1 = change(s,i,j);
        list.add(s1);
      }
    }
    Collections.sort(list);
    System.out.println(list.get(0));
  }
  public static String change(String s, int i, int j){
    String s1 = s.substring(0, i);
    String s2 = s.substring(i, j);
    String s3 = s.substring(j);
    s1 = reverse(s1);
    s2 = reverse(s2);
    s3 = reverse(s3);
    return s1+s2+s3;
  }
  public static String reverse(String s){
    StringBuilder sb = new StringBuilder();
    String s2 = sb.append(s).reverse().toString();
    return s2;
  }
}
/*
끊는 쪽이


 */
