package ex6.Chapter11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);

    while(!q.isEmpty()) {
      System.out.println(q.poll());
    }

  }
}
