package ex6.exercise;

public class HumanTest {
  public static void main(String[] args) {
    Human.echo();

    Student s = new Student(20);
    s.print();
    s.eat();

    Human p = new Worker();
    p.print();
    p.eat();
  }
}
