package ex5.Section3;

public class TV implements Controllable {
  @Override
  public void turnOn() {
    System.out.println("TV를 켠다");
  }

  @Override
  public void turnOff() {
    System.out.println("TV를 끈다");
  }

  @Override
  public void repair() {
    Controllable.super.repair();
  }
}
