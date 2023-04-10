package ex5.Section3;

public class Notebook extends Computer implements Portable{
  @Override
  public void turnOn() {
    System.out.println("노트북을 켠다.");
  }

  @Override
  public void turnOff() {
    System.out.println("노트북을 끈다.");
  }

  @Override
  public void inMyBag() {
    System.out.println("노트북은 가방에 있다.");
  }

  public static void main(String[] args) {
    Notebook n = new Notebook();
    n.turnOn();
    n.turnOff();
    n.inMyBag();
  }
}
