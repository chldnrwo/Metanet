package ex5;

public class PersonDemo {
  public static void main(String[] args) {
    Person p, p1;
    Student s1;
    Employee e1;
    Student s = new Student();
    Employee e = new Employee();
    p = s; //p=(Persom)s 업캐스팅
    p1 = e;
    p.name = "John";
    p.whoAmI();

    p1.name = "홍길동";
    p1.whoAmI();
    //p1.title;
    //p1.work();

    //s1 = e1;
  }
}
