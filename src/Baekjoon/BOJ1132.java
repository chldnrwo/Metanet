package Baekjoon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BOJ1132 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    long[] arr = new long[10];
    Pair[] p = new Pair[10];
    String[] str = new String[n];
    Arrays.fill(arr, 0);
    for(int i = 0; i < n; i++){
      String s = in.next();
      str[i] = s;
      for(int j = s.length()-1; j >=0; j--){
        int a = s.charAt(j)-65;

        arr[a] += Math.pow(10, s.length()-j-1);
      }
      //System.out.println(Arrays.toString(arr));

      for(int j = 0; j < 10; j++){
        char a = (char) (j+65);
        p[j] = new Pair(a, arr[j]);
      }
      Arrays.sort(p, (s1, s2)-> Long.compare(s2.num, s1.num));


    }
//    for(Pair pp : p){
//      System.out.println(pp.ch+" "+pp.num);
//    }
    boolean[] pch = new boolean[10];
    //System.out.println(p[p.length-1].ch);

    int ch = p[p.length-1].ch-65;
    for(int i=0;i<n;i++){
      int a = str[i].charAt(0)-65;
      pch[a] = true;
    }
    //System.out.println(Arrays.toString(pch));
    if(pch[ch]){
      for(int i=9;i>=0;i--){
        int a = p[i].ch-65;
       // System.out.print(a+" ");

        if(!pch[a]){
          a += 65;  // 9
          ch += 65; // 1
          Pair tmp = new Pair('a', 1);
          boolean go = false;
          for(int j=0;j<p.length-1;j++){
            if(p[j].ch == a){
              tmp = p[j];
              go = true;
            }
            if(go){
              p[j] = p[j+1];
            }
          }
          p[p.length-1] = tmp;
          break;
        }
      }
    }
    Map<Character, Integer> map = new HashMap<>();
    for(int i=9;i>=0;i--){
      //p[i].num = 9-i;
      map.put(p[i].ch, 9-i);
    }

//    for(Pair pp : p){
//      System.out.println(pp.ch+" "+pp.num);
//    }
    long sum = 0;
    for(int i=0;i<n;i++){
      String sf = str[i];
      long tot = 0;
      for(int j=0;j<sf.length();j++){
        char a = sf.charAt(j);
        long d = (long) (map.get(a) * Math.pow(10, sf.length()-j-1));
        tot+=d;
      }
      sum+=tot;
    }
    System.out.println(sum);
  }
  static class Pair{
    private char ch;
    private long num;

    public Pair(char ch, long num) {
      this.ch = ch;
      this.num = num;
    }

  }
}

/*
문자열 잘라서 배열에 넣기
0이 아닌 배열값들에게 다음으로 높은 숫자들 부여
첫 값이 0인 수가 나올 경우 i값 받은 문자와 교체

897
978
*/