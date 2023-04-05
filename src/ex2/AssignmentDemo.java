package ex2;

public class AssignmentDemo {
  public static void main(String[] args) {
    int sum = 0, i=10, j=10;
    sum = sum+i;
    sum = sum+j;
    System.out.println("sum = " + sum);
    sum = sum-i;
    sum = sum-j;
    System.out.println("sum = " + sum);

    int value = 0;
    value = value+1;
    value +=1;
    value++;
    ++value;
    System.out.println("value = " + value);
    value = 0;
    int a = ++value;
    System.out.printf("a = ++value , a = %d, value = %d \n", a, value);
    value = 0;
    int b = value++;
    System.out.printf("b = value++ , b = %d, value = %d \n", b, value);

    value = value - 1;
    value -= 1;
    value--;
    --value;
    System.out.println("value = " + value);
  }
}
