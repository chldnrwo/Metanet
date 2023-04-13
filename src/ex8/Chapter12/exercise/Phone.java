package ex8.Chapter12.exercise;

public class Phone {
  private String name;
  private String address;
  private String number;

  public Phone(String name, String address, String number) {
    this.name = name;
    this.address = address;
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public String getNumber() {
    return number;
  }
}
