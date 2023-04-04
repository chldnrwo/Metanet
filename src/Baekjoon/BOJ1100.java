package Baekjoon;

import java.util.Scanner;

class BOJ1100 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int black=0;
    int white=0;
    for(int i=0;i<8;i++){
      String s = in.next();
      for(int j=0;j<8;j++){
        char a = s.charAt(j);
        if(a == 'F'){
          if((i+j)%2==0){
            white++;
          }else{
            black++;
          }
        }
      }
    }
    System.out.println(white);
  }
}

