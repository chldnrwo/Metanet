package A;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    int n = in.nextInt();

    for(int i = 0; i < n; i++) {
      int a = in.nextInt();
      String s = Integer.toBinaryString(a);
      for(int j=s.length()-1;j>=0;j--){
        char c = s.charAt(j);
        if(c == 49){
          sb.append(s.length() - 1 - j).append(" ");
        }
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }
}
/*
1101


 */