package ex2;

public class TernaryOperatorDemo {
  public static void main(String[] args) {
    boolean res = false;
    if(1==1){
      res = true;
    }else{
      res = false;
    }
    System.out.println(res);

    boolean res2 = (1==1) ? true : false;
    System.out.println(res2);

    int x=1,y;
    y= (x==1) ? 10 : 20;
    System.out.println("y = " + y);
    y= (x<1) ? x++ : x+20;
    System.out.println("x = " + x);
    System.out.println("y = " + y);
  }
}
