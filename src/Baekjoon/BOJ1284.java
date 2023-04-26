package Baekjoon;

import java.util.Scanner;

class BOJ1284 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while(true){
      int cnt = 0;
      String s = in.next();
      if(s.equals("0")){
        break;
      }
      for(int i = 0; i <s.length(); i++){
        char c = s.charAt(i);
        if(c == '0'){
          cnt+=4;
        }else if(c == '1'){
          cnt+=2;
        }else{
          cnt+=3;
        }
      }
      cnt+=s.length()-1;
      cnt+=2;

      System.out.println(cnt);
    }

  }
}
/*



 */
