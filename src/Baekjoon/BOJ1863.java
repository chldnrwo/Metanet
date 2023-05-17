
package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

class BOJ1863 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int[] arr = new int[n+1];
    for(int i=0;i<n;i++){
      int x = in.nextInt();
      int y = in.nextInt();
      arr[i] = y;
    }
    int res = 0;
    Stack<Integer> stack = new Stack<Integer>();
    for(int i=0;i<=n;i++){
      while(!stack.isEmpty() && stack.peek() > arr[i]){
        res++;
        stack.pop();
      }
      if(!stack.isEmpty() && stack.peek() == arr[i]){
        continue;
      }
      stack.push(arr[i]);
    }
    System.out.println(res);
  }
}
/*



 */
