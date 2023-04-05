package ex2;

import java.util.Scanner;

public class SwitchDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String button, product;

    while(true){
      button = in.next();
      if(button.equals("X") || button.equals("x")){
        System.out.println("프로그램을 종료합니다.");
        break;
      }
      switch (button){
        case "A" :
        case "a" :
          product = "콜라";
          break;
        case "B" :
        case "b" :
          product = "사이다";
          break;
        case "C" :
        case "c" :
          product = "환타";
          break;
        default :
          product = "없음";
      }
      System.out.println(product);
    }




//    double value = 10.0;
//    switch ((int)value){
//      case 10 :
//        System.out.println("10 입니다.");
//        break;
//      case 11 :
//        System.out.println("11 입니다.");
//        break;
//      default :
//        System.out.println("둘다아닙니다.");
//    }
  }
}
