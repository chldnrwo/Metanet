package ex4;

public class AnimalDemo {
  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.eat();
    animal.sleep();

    Eagle eagle = new Eagle();
    eagle.eat();
    eagle.sleep();
    eagle.fly();

    Tiger tiger = new Tiger();
    tiger.eat();
    tiger.sleep();
    tiger.run();

    Goldfish goldfish = new Goldfish();
    goldfish.eat();
    goldfish.sleep();
    goldfish.swim();
  }
}
