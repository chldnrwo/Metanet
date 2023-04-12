package ex6.Chapter11;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerFormanceDemo {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    LinkedList<Integer> linkedList = new LinkedList<Integer>();

    long start = System.nanoTime();
    for(int i=0; i<100000;i++){
      arrayList.add(0,i);
    }
    long end = System.nanoTime();
    long duaration = end - start;
    System.out.println("ArrayList add에 걸린 시간 : "+duaration);

    start = System.nanoTime();
    for(int i=0; i<100000;i++){
      linkedList.addFirst(i);
    }
    end = System.nanoTime();
    duaration = end - start;
    System.out.println("LinkedList add에 걸린 시간 : "+duaration);

    start = System.nanoTime();
    for(int i=0; i<100000;i++){
      arrayList.get(i);
    }
    end = System.nanoTime();
    duaration = end - start;
    System.out.println("ArrayList get에 걸린 시간 : "+duaration);

    start = System.nanoTime();
    for(int i=0; i<100000;i++){
      linkedList.get(i);
    }
    end = System.nanoTime();
    duaration = end - start;
    System.out.println("LinkedList get에 걸린 시간 : "+duaration);


  }
}
