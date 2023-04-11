package ex6;

public class Keyboard {
  String name;

  public Keyboard(String name) {
    this.name = name;
  }

  public boolean equals(Object o) {
    if (o instanceof Keyboard) {
      Keyboard k = (Keyboard) o;
      if (name.equals(k.name)) {
        return true;
      }

    }
    return false;
  }
  public String toString(){
    return "키보드입니다.";
  }
}
