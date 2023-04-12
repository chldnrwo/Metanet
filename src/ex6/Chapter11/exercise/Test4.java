package ex6.Chapter11.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test4 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    while(true){
      System.out.print("점수를 입력하세요 : ");
      int a = in.nextInt();

      if(a<0){
        break;
      }
      list.add(a);
    }
    System.out.println("전체 학생은 "+list.size()+"명이다.");
    System.out.print("학생들의 성적 : ");
    for(int i=0;i<list.size();i++){
      System.out.print(list.get(i)+" ");
    }
    System.out.println();

    int max = 0;
    for(int i=0;i<list.size();i++){
      max = Math.max(max, list.get(i));
    }

    for(int i=0;i<list.size();i++){
      if(list.get(i) >= max-10){
        System.out.println(i+"번 학생의 성적은 "+list.get(i)+"점이며 등급은A이다.");
      }else if(list.get(i) >= max-20){
        System.out.println(i+"번 학생의 성적은 "+list.get(i)+"점이며 등급은B이다.");
      }else{
        System.out.println(i+"번 학생의 성적은 "+list.get(i)+"점이며 등급은C이다.");
      }
    }

  }

}
