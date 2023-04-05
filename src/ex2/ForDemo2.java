package ex2;

public class ForDemo2 {
  public static void main(String[] args) {
    int sum=0;
    for(int i=1;i<=10;i++){
      sum+=i;
    }
    System.out.println("sum = " + sum);

    sum = 0;
    for(int i=11;i<=20;i++){
      sum+=i;
    }
    System.out.println("sum = " + sum);

    sum = 0;
    for(int i=21;i<=30;i++){
      sum+=i;
    }
    System.out.println("sum = " + sum);

    for(int i=0;i<3;i++){
      int num1 = i*10+1;
      int num2 = i*10+10;
      int sum1 = 0;
      for(int j=num1;j<=num2;j++){
        sum1+=j;
      }
      System.out.println("sum1 = " + sum1);
    }

    System.out.println("tot1 = "+sum(1,10));
    System.out.println("tot2 = "+sum(11,20));
    System.out.println("tot3 = "+sum(21,30));
  }
  public static int sum(int i, int j){
    int sum = 0;
//    for(int k=i;k<=j;k++){
//      sum+=k;
//    }
    sum = (i+j) * (j-i+1) / 2;
    return sum;
  }
}
