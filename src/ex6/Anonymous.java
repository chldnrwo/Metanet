package ex6;

public class Anonymous {
  Bird e = new Bird();

  public void move(){
    System.out.println("독수리가 난다~~~.");
  }
  void sound(){
    System.out.println("휘익~~~.");
  }

  public static void main(String[] args) {
    Anonymous a = new Anonymous();
    a.e.move();
    //a.e.sound();
    a.sound();
    a.move();
  }
}
