package ex5;

public class StudentDemo2 {
  public static void main(String[] args) {
    Person p;
    Student s = new Student();

    p = s;
    Student s1 = (Student)p;
    s1.work();
    s1.whoAmI();
    System.out.println(s1.name+" "+s1.number);

    Employee e = new Employee();
    System.out.println("----------------");
    Person p1 = new Person();
    callingPerson(p1);
    callingPerson(s);
    callingPerson(e);
  }
  static void callingPerson(Person p){
    // student 이면 work+number
    if(p instanceof Student){
      Student s = (Student)p;
      s.work();
    }
    // employee 이면 work+title
    else if(p instanceof Employee){
      Employee e = (Employee)p;
      e.work1();
    }
    // person 이면
    else if(p instanceof Person){
      p.whoAmI();
    }
  }
//  static void callingPerson(Student s){
//    s.whoAmI();
//  }
//  static void callingPerson(Employee e){
//    e.whoAmI();
//  }
}
