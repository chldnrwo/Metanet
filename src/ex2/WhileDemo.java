package ex2;

public class WhileDemo {
  public static void main(String[] args) {
    for(int i=0;i<10;i++){
      System.out.println(i);
    }
    int j=0;
    while(j < 10){
      System.out.println(j);
      j++;
    }

    int k = 0;
    while(true){
      if(k>=10){
        break;
      }
      System.out.println(k);
      k++;
    }


  }
}
