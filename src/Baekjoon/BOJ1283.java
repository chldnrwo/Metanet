package Baekjoon;

import java.util.Scanner;

class BOJ1283 {
  static boolean[] check;
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    Scanner in = new Scanner(System.in);

    check = new boolean[26];

    String num = in.nextLine();
    int n = Integer.parseInt(num);
    String[] arr = new String[n];

    for(int i=0;i<n;i++){
      arr[i] = in.nextLine();
      sb.append(d(arr[i])).append("\n");
    }
    System.out.println(sb);
    //System.out.println(Arrays.toString(check));
  }
  public static String d(String s){
    String[] tmp = s.split(" ");
    for(int j = 0;j<tmp.length;j++){
      char c = tmp[j].charAt(0);
      if(c > 96) c-=32; //대문자로 통일
      if(!check[c-65]){
        check[c-65] = true;
        tmp[j] = work(j, 0, tmp);

        String res = "";
        for(int k=0;k<tmp.length;k++){
          res+=(tmp[k]+" ");
        }
        return res;
      }
    }

    for(int j = 0;j<tmp.length;j++){
      String str = tmp[j];
      for(int i = 1;i<str.length();i++){
        char c = str.charAt(i);
        if(c > 96) c-=32; //대문자로 통일

        if(!check[c-65]){
          check[c-65] = true;
          tmp[j] = work(j, i, tmp);

          String res = "";
          for(int k=0;k<tmp.length;k++){
            res+=(tmp[k]+" ");
          }
          return res;
        }
      }
    }
    return s;
  }
  public static String work(int idx, int idx2, String[] tmp){
    String s = tmp[idx];
    String s1 = s.substring(0, idx2);
    String s2 = s.substring(idx2, idx2+1);
    String s3 = s.substring(idx2+1);
    s = s1 + "[" + s2 + "]" + s3;

    return s;
  }
}
/*
첫글자부터 순차적으로 단축키 처리
첫글자 단축키 처리 우선
그다음에 두번째 글자 순회

대소문자는 구분 하지않음 ignorecamelcase 필요할 것

5
New
Open
Save
Save As
Save All

[N]ew
[O]pen
[S]ave
Save [A]s
Sa[v]e All
모든 단어의 첫글자가 전부 안될 경우에만 단어마다 다음 글자들 체크

 */
