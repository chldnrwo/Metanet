package ex2;

import java.util.Scanner;

public class IfElseDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("숫자를 입력하세요 : ");
    int i = in.nextInt();

    if (i > 0){
      System.out.printf("입력 받은 숫자는 %d이고 양수입니다. \n", i);
    }
    else if(i==0){
      System.out.printf("입력 받은 숫자는 %d 입니다. \n", i);
    }
    else {
      System.out.printf("입력 받은 숫자는 %d이고 음수입니다. \n", i);
    }
    System.out.println("프로그램 종료");
  }


}
