package ex2;

import java.util.Scanner;

public class ScannerDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("첫번째 숫자를 입력하세요 : ");
    String x = in.nextLine();
    //ctrl alt v
    int i = Integer.parseInt(x);
    System.out.println("두번째 숫자를 입력하세요 : ");
    String y = in.next();
    int j = Integer.parseInt(y);

    System.out.printf("x + y = %s + %s = %s \n",x,y,x+y);
    System.out.printf("i + j = %d + %d = %d \n",i,j,i+j);
  }
}
