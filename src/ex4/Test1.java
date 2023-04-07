package ex4;

import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = countChar("Strings", 's');
    System.out.println(a);
    System.out.println(sum(1,2,3,4));
    int[] arr = {2,3};
    System.out.println(sum(1, arr));
    System.out.println(sum(1,2,3,4,5));
    String s = in.next();
    check(s);
  }
  static int countChar(String s, char c){
    int cnt = 0;
    for(int i = 0; i < s.length(); i++){
      if((s.charAt(i)+"").equalsIgnoreCase(c+"")){
        cnt++;
      }
    }
    return cnt;
  }
  static int sum(int num,int... arr){
    int sum = 0;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    return sum;
  }

  static void check(String s){
    String s1 = s.substring(s.length()-3, s.length());
    if(s1.equals("com")){
      System.out.println(s+"은 'com'으로 끝납니다.");
    }
    for(int i=0;i<s.length()-4;i++){
      String s2 = s.substring(i, i+4);
      if(s2.equals("java")){
        System.out.println(s+"은 'java'를 포함합니다.");
      }
    }
    if(s.equals("bye")){
      System.out.println("프로그램을 종료합니다");
    }
  }

}
