package ex5.Section3;

public interface Controllable {
  void turnOn();
  void turnOff();

  default void repair(){
    System.out.println("장비를 수리한다.");
  }
  static void reset(){
    System.out.println("장비를 초기화한다.");
  }
}
