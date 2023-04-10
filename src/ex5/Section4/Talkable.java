package ex5.Section4;

public interface Talkable {
  void talk();
}
class Korean implements Talkable {
  @Override
  public void talk() {
    System.out.println("안녕하세요!");
  }
}
class American implements Talkable {
  @Override
  public void talk() {
    System.out.println("Hello!");
  }
}
class TalkableTest{
  static void speak(Talkable t){
    t.talk();
  };

  public static void main(String[] args) {
    speak(new Korean());
    speak(new American());
  }
}