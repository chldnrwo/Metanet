
package Baekjoon;

import java.util.Scanner;

class BOJ27960 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b = in.nextInt();

    String ba = Integer.toBinaryString(a);
    String bb = Integer.toBinaryString(b);
    //System.out.println(ba);
    //System.out.println(bb);
    String s = "";
    int alen = ba.length();
    int blen = bb.length();
    int len = Math.max(ba.length(), bb.length());

    if(alen < blen){
      for(int i = 0; i < len-alen; i++){
        ba = "0"+ba;
      }
    }else{
      for(int i = 0; i < len-blen; i++){
        bb = "0"+bb;
      }
    }
    //System.out.println(ba);
    //System.out.println(bb);

    for(int i = 0;i<len;i++){
      if(ba.charAt(i) != bb.charAt(i)){
        s += "1";
      }else{
        s += "0";
      }
    }


    int sum = 0;
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) == '1'){
        sum += Math.pow(2, len -1 - i);
      }
    }

    System.out.println(sum);
  }
}
/*



 */
