package ex4;

import java.util.Arrays;

public class Test2 {
  public static void main(String[] args) {
    String[] name = {"가위", "바위", "보"};
    System.out.println(name);
    System.out.println(Arrays.toString(name));
    for(int i = 0;i<10;i++){
      double d = Math.random() * 3;
      System.out.println(name[(int)d]);
    }
  }
}
