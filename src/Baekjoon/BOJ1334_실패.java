
package Baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

class BOJ1334_실패 {
  static String n;
  static int len;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    n = in.next();
    len = n.length();

    System.out.println(d());
  }
  public static String d(){
    if(len%2 !=0) {
      //홀수
      int len2 = len/2;
      String s = n.substring(len2, len2+1);
      if(s.equals("9")){
        String s1 = n.substring(0, len2);
        String tmp = n.substring(len2+1);
        StringBuilder sb = new StringBuilder(tmp);
        String s2 = sb.reverse().toString();
        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);
        if(b1.compareTo(b2)>0){
          sb = new StringBuilder(s1);
          String s3 = sb.reverse().toString();
          return s1+s+s3;
        }else{
          BigInteger b3 = new BigInteger(s1+s);
          b3 = b3.add(BigInteger.ONE);
          String s3 = b3.toString();
          String s4 = s3.substring(0, s3.length()-1);
          sb = new StringBuilder(s4);
          s4 = sb.reverse().toString();
          return s3+s4;
        }
      }else{
        s = String.valueOf(Integer.parseInt(s)+1);
        String s1 = n.substring(0, len2);
        StringBuilder sb = new StringBuilder(s1);
        String s2 = sb.reverse().toString();
        return s1+s+s2;
      }
    }else{
      int len2 = len/2;
      String s1 = n.substring(0, len2);
      String s2 = n.substring(len2);
      StringBuilder sb = new StringBuilder(s1);
      String s3 = sb.reverse().toString();

      BigInteger b1 = new BigInteger(s3);
      BigInteger b2 = new BigInteger(s2);
      BigInteger b3 = new BigInteger(s1);
      if(b1.compareTo(b2)>0){

        return s1+s3;
      }else{
        //여기서도 홀짝 갈라야됨

        BigInteger b4 = b3.add(BigInteger.ONE);
        String s4 = b4.toString();

        if(s4.length()%2==0){
          sb = new StringBuilder(s4);
          String s5 = sb.reverse().toString();
          return s4+s5;
        }else{
          String s5 = s4.substring(0, s4.length()-1);
          sb = new StringBuilder(s5);
          String s6 = sb.reverse().toString();
          //System.out.println(s4+" "+s5+" "+s6);
          return s4+s6;
        }
      }
    }
  }
}
/*
홀수일때 짝수일때

양의정수가 50자리니까 분기가 살인적이지는 않을 것이다

짝수
ㄴ앞 반쪽의 리버스가 크거나 작거나
 */
