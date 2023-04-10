//package ex5.exercise1;
//
//public class Test  {
//  public static void main(String[] args) {
//    Person p1 = new Person();
//    p1.setName("길동이");
//    p1.setAge(22);
//    Student s1 = new Student();
//    s1.setName("황진이");
//    s1.setAge(23);
//    s1.setStudentNum(100);
//    ForeignStudent f1 = new ForeignStudent();
//    f1.setName("Amy");
//    f1.setAge(30);
//    f1.setStudentNum(200);
//    f1.setCountry("U.S.A");
//
//    Person[] people = {p1, s1, f1};
//
//    for(Person p : people){
//      System.out.println(p.show());
//    }
//
//  }
//}
//class Person {
//  String name;
//  int age;
//
//  public String getName() {
//    return name;
//  }
//
//  public void setName(String name) {
//    this.name = name;
//  }
//
//  public int getAge() {
//    return age;
//  }
//
//  public void setAge(int age) {
//    this.age = age;
//  }
//
//  String show(){
//    String s;
//    s = "[이름 : "+name+", 나이 : "+age+"]";
//    return s;
//  }
//
//}
//class Student extends Person{
//  int studentNum;
//  String show(){
//    String s;
//    s = "[이름 : "+name+", 나이 : "+age+", 학번 : "+studentNum+"]";
//    return s;
//  }
//
//  public int getStudentNum() {
//    return studentNum;
//  }
//
//  public void setStudentNum(int studentNum) {
//    this.studentNum = studentNum;
//  }
//}
//class ForeignStudent extends Student{
//  String country;
//  String show(){
//    String s;
//    s = "[이름 : "+name+", 나이 : "+age+", 학번 : "+studentNum+", 국적 : "+country+"]";
//    return s;
//  }
//
//  public String getCountry() {
//    return country;
//  }
//
//  public void setCountry(String country) {
//    this.country = country;
//  }
//}
