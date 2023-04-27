package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class BOJ1092_배_스택_메모리초과 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    Integer mCrane = 0;
    Integer mPack = 0;
    Integer n = in.nextInt();
    Integer[] crane = new Integer[n];
    for(int i = 0; i < n; i++){
      crane[i] = in.nextInt();
      mCrane = Math.max(mCrane, crane[i]);
    }
    Integer m = in.nextInt();
    Integer[] pack = new Integer[m];
    for(int i = 0; i < m; i++){
      pack[i] = in.nextInt();
      mPack = Math.max(mPack, pack[i]);
    }
    if(mCrane < mPack){
      System.out.println(-1);
      System.exit(0);
    }

    Arrays.sort(crane);
    Arrays.sort(pack);

    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    for(int i = 0; i < m;i++){
      stack.push(pack[i]);
    }
    //System.out.println(Arrays.toString(crane));
    //System.out.println(Arrays.toString(pack));

    int cnt = 0;
    while(!stack.isEmpty()){
      for(int i = 0; i < n; i++){

        if(!stack.isEmpty()&&crane[i]>=stack.peek()){
          stack.pop();
          //System.out.println("적합 "+stack +" "+ stack2);
        }else{
          while(!stack.isEmpty()){
            if(!stack.isEmpty()){
              int a = stack.pop();
              stack2.push(a);
              //System.out.println("스택 2 옮김 "+stack +" "+ stack2);
            }
            if(!stack.isEmpty()&&crane[i]>=stack.peek()){
              stack.pop();
              //System.out.println("적합 찾음"+stack +" "+ stack2);
              break;
            }
          }
          while(!stack2.isEmpty()){
            int a = stack2.pop();
            stack.push(a);
            //System.out.println("스택2 원상복귀"+stack +" "+ stack2);
          }
        }
      }
      cnt++;

     }
    System.out.println(cnt);
  }
}
/*
큰것부터 넣어야되는 문제였다


 */