package Baekjoon;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ1092 {

  public static void main(String[] args) throws IOException {

   Scanner in = new Scanner(System.in);;

    int N = in.nextInt();
    int[] crane = new int[N];
    for (int i = 0; i < N; i++) {
      crane[i] = in.nextInt();
    }
    Arrays.sort(crane);

    int M = in.nextInt();
    Stack stack = new Stack(M);
    for (int i = 0; i < M; i++) {
      stack.push(in.nextInt());
    }
    Arrays.sort(stack.arr);

    int time = 0;
    if (stack.peek() > crane[N - 1]) {
      time = -1;
    } else {
      Stack temp = new Stack(M);
      while (!stack.isEmpty()) {
        for (int i = N - 1; i >= 0; i--) {
          int box;
          while (!stack.isEmpty() && (box = stack.pop()) > crane[i]) {
            temp.push(box);
          }
        }

        while (!temp.isEmpty()) {
          stack.push(temp.pop());
        }
        time++;
      }
    }

    System.out.println(time);
  }

  public static class Stack {
    int[] arr;
    int index;

    public Stack(int M) {
      arr = new int[M];
      index = 0;
    }

    public void push(int num) {
      arr[index++] = num;
    }

    public int pop() {
      return arr[--index];
    }

    public int peek() {
      return arr[index - 1];
    }

    public boolean isEmpty() {
      return index == 0;
    }
  }
}
/*
원스택으로 처리
투스택은 보통 메모리 초과가 잦음
*/