package Baekjoon;

import java.util.Scanner;

class BOJ1291 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    boolean im = im(n);
    boolean im2 = im2(n);

    if(im && im2){
      System.out.println(4);
    }else if(!im && !im2){
      System.out.println(3);
    }else if(im && !im2){
      System.out.println(1);
    }else if(!im && im2){
      System.out.println(2);
    }
  }
  public static boolean soinsuBi(int n){
    int cnt = 0;
    for(int i=2;i<=n;i++){
      if(n%i==0){
        cnt++;
        while(n%i==0){
          n/=i;
        }
      }
    }
    if(cnt%2==0){
      return true;
    }
    return false;
  }
  public static boolean sosu(int n){
    for(int i=2;i*i<=n;i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
  public static boolean im2(int n){
    if(n == 2){
      return true;
    }else if(n == 4){
      return true;
    }else if(!sosu(n) && soinsuBi(n)){
      return true;
    }

    return false;
  }
  public static boolean im(int n){
    String s = String.valueOf(n);
    int sum = 0;
    for(int i = 0; i < s.length(); i++){
      String s1 = s.substring(i,i+1);
      int a = Integer.parseInt(s1);
      sum+=a;
    }
    if(6<=n
        && (sum%2!=0)){
      return true;
    }
    return false;
  }
}
/*



 */