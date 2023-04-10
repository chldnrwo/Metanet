package ex5.exercise1;

public class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void show(){
    System.out.println("사람[이름 : "+name + ", 나이 : " + age + "]");
  }
}

class Student extends Person{
  int number;

  public Student(String name, int age, int number) {
    super(name, age);
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  @Override
  public void show() {
    System.out.println("사람[이름 : "+name + ", 나이 : " + age
        + ", 학번 : " + number + "]");
  }
}

class ForiegnStudent extends Student {
  String nationality;

  public ForiegnStudent(String name, int age, int number, String nationality) {
    super(name, age, number);
    this.nationality = nationality;
  }

  public String getNationality() {
    return nationality;
  }

  @Override
  public void show() {
    System.out.println("사람[이름 : "+name + ", 나이 : " + age
        + ", 학번 : " + number
        +", 국적 : "+ nationality + "]");
  }
}