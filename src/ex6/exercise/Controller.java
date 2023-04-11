package ex6.exercise;

public abstract class Controller {
  boolean power;
  void show(){
  };
  abstract String getName();
}
class TV extends Controller{
  boolean power;

  public TV(boolean power) {
    this.power = power;
  }

  @Override
  void show() {
    String s = getName();
    if(power){
      System.out.println(s+"가 켜졌습니다.");
    }else{
      System.out.println(s+"가 꺼졌습니다.");
    }
  }
  @Override
  String getName() {
    return "TV";
  }
}
class Radio extends Controller{
  boolean power;

  public Radio(boolean power) {
    this.power = power;
  }

  @Override
  void show() {
    String s = getName();
    if(power){
      System.out.println(s+"가 켜졌습니다.");
    }else{
      System.out.println(s+"가 꺼졌습니다.");
    }
  }
  @Override
  String getName() {
    return "Radio";
  }

}

