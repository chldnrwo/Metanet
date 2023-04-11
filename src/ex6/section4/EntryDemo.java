package ex6.section4;

public class EntryDemo {
  public static void main(String[] args) {
    Entry<String, Integer> entry = new Entry<>("홍길동", 30);
    String name = entry.getKey();
    int age = entry.getValue();
    System.out.println(name+" "+age);
    Entry<String, Integer> entry1 = new Entry<>("김선달", 20);
    Entry<Integer, String> entry2 = new Entry<>(1,"김선달");
    Entry<String, String> entry3 = new Entry<>("홍길동", "30");


  }
}
