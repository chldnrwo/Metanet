package ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList2Demo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();

    while(true){
      int num = in.nextInt();
      if(num == -1){
        break;
      }
      list.add(num);
    }
    int sum = 0;
    for(Integer i : list){
      sum+=i;
    }
    System.out.println(sum);
    System.out.println(sum/(double)list.size());
  }
}
