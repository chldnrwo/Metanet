package ex5;

public class Person {
  String name = "사람";

  void whoAmI(){
    System.out.println("나는 사람입니다.");
  }
}
class Student extends Person{
  int number = 7;

  void work(){
    System.out.println("나는 공부합니다.");
  }
}
class Employee extends Person{
  String title = "sawon";

  void work1(){
    System.out.println("나는 일합니다.");
  }

}
