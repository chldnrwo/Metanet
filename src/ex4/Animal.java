package ex4;

public class Animal {
  String eye;
  String mouth;

  void eat(){
    System.out.println("eating");
  }
  void sleep(){
    System.out.println("sleeping");
  }
}
class Eagle extends Animal{
  String wing;

  void fly(){
    System.out.println("flying");
  }
}
class Tiger extends Animal{
  String leg;
  void run(){
    System.out.println("running");
  }
}
class Goldfish extends Animal{
  String fin;
  void swim(){
    System.out.println("swimming");
  }
}