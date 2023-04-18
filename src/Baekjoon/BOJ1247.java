package Baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

class BOJ1247 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);



    for (int i = 0; i < 3; i++) {
      long n = in.nextLong();
      BigInteger sum = new BigInteger("0");
      for(int j=0;j<n;j++){
        long l = in.nextLong();
        BigInteger l2 = new BigInteger(Long.toString(l));
        sum = sum.add(l2);
        //System.out.println(l2);
        //System.out.println(sum);
      }

      if(sum.compareTo(BigInteger.ZERO) == 0){
        System.out.println(0);
      }else if(sum.compareTo(BigInteger.ZERO) > 0){
        System.out.println("+");
      }else{
        System.out.println("-");
      }
    }

  }
}
/*
일단 long 써야됨
6
9223372036854775807
9223372036854775806
9223372036854775805
-9223372036854775807
-9223372036854775806
-9223372036854775804
이경우 순서대로 할 경우 long으로도 감당 안됨
1. biginteger를 쓴다

 */