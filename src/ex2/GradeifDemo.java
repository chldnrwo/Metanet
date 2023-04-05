package ex2;

import java.util.Scanner;

public class GradeifDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("점수를 입력하세요 : ");
    int i = in.nextInt();
    if(!val(i)){
      System.out.println("범위를 벗어난 숫자입니다.");
      return;
    }

    String grade;
    if(i>=90){
      if(i>=95){
        grade = "A+";
      }else{
        grade = "A0";
      }
    }else if(i>=80){
      if(i>=85){
        grade = "B+";
      }else{
        grade = "B0";
      }
    }else if(i>=70){
      if(i>=75){
        grade = "C+";
      }else{
        grade = "C0";
      }
    }else{
        grade = "D0";
    }
    System.out.printf("입력 받은 숫자는 %d 이고 %s입니다.", i, grade);
  }
  public static boolean val(int i){
    if(0<=i&&i<=100) return true;
    return false;
  }
}
