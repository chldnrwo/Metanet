package ex5.exercise1;

public class Test2 {
  public static void main(String[] args) {
    Phone[] phones = {new Phone("황진이"), new Telephone("길동이", "내일"), new SmartPhone("민국이", "갤러그")};

    for(Phone p : phones) {
      if(p instanceof SmartPhone) {
        ((SmartPhone) p).playGame();
      }else if(p instanceof Telephone) {
        ((Telephone) p).autoAnswering();
      }else{
        p.talk();
      }
    }
  }
}
class Phone{
  protected String owner;

  public Phone(String owner) {
    this.owner = owner;
  }

  public String getOwner() {
    return owner;
  }

  void talk(){
    System.out.println("통화 중");
  }
}
class Telephone extends Phone{
  private String when;

  public Telephone(String owner, String when) {
    super(owner);
    this.when = when;
  }

  public String getWhen() {
    return when;
  }

  void autoAnswering(){
    System.out.println(owner+"가 부재중이니 "+when+"에 전화 요망");
  }
}
class SmartPhone extends Phone{
  private String game;

  public SmartPhone(String owner, String game) {
    super(owner);
    this.game = game;
  }

  public String getGame() {
    return game;
  }

  void playGame(){
    System.out.println(owner+"가 "+game+" 게임 중");
  }
}