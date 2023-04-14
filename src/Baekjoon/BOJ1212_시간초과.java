package Baekjoon;

import java.util.Scanner;

class BOJ1212_시간초과 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);


    String s = in.next();
    char[] c = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      c[i] = s.charAt(i);
    }
    String sf = "";
    int cnt = 0;
    while(true){
      if(cnt == s.length()){
        break;
      }
      String s1 = "";
      int a1 = c[cnt] - 48;
      for(int i = 0; i < 3; i++){

        String s2 = Integer.toString(a1%2);
        a1 = a1/2;
        s1 = s2 + s1;
      }

      sf = sf+s1;
      cnt++;
    }

    while(true){
      if(sf.substring(0,1).equals("0")){
        sf = sf.substring(1);
      }else{
        break;
      }
    }
    System.out.println(sf);
  }

}
/*



 */
