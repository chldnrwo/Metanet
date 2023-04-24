package Baekjoon;

import java.util.Scanner;

class BOJ1264 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    while(true){
      int cnt = 0;
      String s = in.nextLine();
      if(s.equals("#")){
        break;
      }
      for(int i=0;i<s.length();i++){
        char a  = s.charAt(i);
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o'|| a == 'u' ||
            a == 'A' || a == 'E' || a == 'I' || a == 'O'|| a == 'U'){
          cnt++;
        }
      }
      sb.append(cnt).append("\n");
    }
    System.out.println(sb);
  }
}
/*



 */
