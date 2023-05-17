
package Baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class BOJ1339 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String[] sarr = new String[n];
    int[] arr = new int[26];
    int[] arr2 = new int[26];
    for(int i = 0; i < n; i++){
      String s = in.next();
      sarr[i] = s;
      for(int j = 0; j < s.length(); j++){
        char c = s.charAt(j);
        int idx = c-65;
        double num = Math.pow(10, s.length() - 1 - j);
        arr[idx] += num;
      }
    }
    List<Pair> list = new ArrayList<Pair>();
    for(int i =0 ;i<26; i++){
      if(arr[i]!=0){
        char c = (char)(i+65);
        list.add(new Pair(c, arr[i]));
      }
    }
    Collections.sort(list, (s1,s2) -> s2.num - s1.num);

    int cnt = 9;
    for(Pair p : list){
      int a = p.c - 65;
      arr2[a] = cnt--;
    }
    int sum = 0;
    for(int i = 0; i < n; i++){
      String s = sarr[i];
      for(int j=0;j<s.length();j++){
        int a = s.charAt(j)-65;
        double num = Math.pow(10, s.length() - 1 - j);
        int res = (int)(arr2[a] * num);
        sum += res;
      }
    }
    System.out.println(sum);
  }
  static class Pair{
    char c;
    int num;

    public Pair(char c, int num) {
      this.c = c;
      this.num = num;
    }
  }
}
/*
알파벳은 대문자만


 */
