package Baekjoon;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

class BOJ1213 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    char[] arr = new char[s.length()];
    for(int i = 0; i < s.length(); i++) {
      arr[i] = s.charAt(i);
    }
    Arrays.sort(arr);

    Deque<Character> q = new LinkedList<>();
    for(int i = 0; i < s.length(); i++) {
      q.offer(arr[i]);
    }

    char[] re = new char[s.length()];
    int cnt = 0;
    int start = 0;
    int end = s.length()-1;
    while(!q.isEmpty()){
      char a = q.poll();
      if(q.isEmpty()){
        re[start] = a;
        continue;
      }
      char b = q.peek();
      if(cnt>=50){
        System.out.println("I'm Sorry Hansoo");
        System.exit(0);
      }

      if(a != b){
        q.offer(a);
        cnt++;
      }
      else{
        b = q.poll();
        re[start] = a;
        re[end] = b;
        start++;
        end--;
      }
    }
    System.out.println(re);

  }
}
/*
poll과 top이 같아야된다


 */
