package ex3;

public class PersonDemo {
  public static void main(String[] args) {
    Person person = new Person();
    person.setAge(21).setName("민국").sayHello();

    Person person2 = new Person();
    person2.setAge(22).setName("대한").sayHello();
  }
}
