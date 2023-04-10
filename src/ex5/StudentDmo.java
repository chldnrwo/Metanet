package ex5;

public class StudentDmo {
  public static void main(String[] args) {
    Student s;
    Person p = new Person();
    s = (Student) p; // downcasting? 안됨 부모를 바로 자식으로 형변환 할 수 없음
    System.out.println(s.number + s.name);
    s.work();
    s.whoAmI();
  }
}
