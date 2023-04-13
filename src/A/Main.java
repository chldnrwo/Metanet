package A;

import java.util.Scanner;

class Main {
  static double[] arr
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    arr = new double[n];
    for(int i = 0; i < n; i++) {
      arr[i] = in.nextDouble();
    }

    for(int i = 1; i <= 1000; i++){
      for(int j = 0; j < n; j++){
        if(!isPos(arr[j], i)){
          break;
        }
        System.out.println(i);
        System.exit(0);
      }
    }

  }
  public static boolean isPos(double j, int i){
    int start = 0;
    int end = 10 * i;
    int mid = (start + end) / 2;




    return false;
  }
}
/*



 */
