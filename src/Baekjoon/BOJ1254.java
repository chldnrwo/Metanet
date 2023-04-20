package Baekjoon;

import java.util.Scanner;

class BOJ1254 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String str = in.next();
    int len = str.length();
    if(pal(str)){
      System.out.println(str.length());
      System.exit(0);
    }

    for(int i=0;i<len;i++) {
      String s2 = str;
      for(int j=i;j>=0;j--){
        s2 = s2+str.substring(j,j+1);
        if(pal(s2)){
          System.out.println(s2.length());
          System.exit(0);
        }
      }


    }
  }

  public static boolean pal(String s){
    StringBuilder sb = new StringBuilder();
    String s2 = sb.append(s).reverse().toString();

    if(s.equals(s2)){
      return true;
    }
    return false;
  }
}
/*



 */