package ex3;

public class Person {
    String name;
    int age;

    public void sayHello() {
      System.out.println("Hello, "+ age + "," + name + "!");
    }

  public String getName() {
    return name;
  }

  public Person setName(String name) {
    this.name = name;
    return this;
  }

  public int getAge() {
    return age;
  }

  public Person setAge(int age) {
    this.age = age;
    return this;
  }
}
