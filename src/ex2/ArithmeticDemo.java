package ex2;

import java.util.Scanner;

public class ArithmeticDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("숫자를 입력하세요 : ");
    int i = in.nextInt();
    System.out.printf("입력받은 숫자는 %d 이고 2로 나누면 나머지가 %d 입니다 \n", i, i%2);
    if(i%2==0) {
      System.out.println("짝수 입니다.");
    }else{
      System.out.println("홀수 입니다.");
    }
  }
}
