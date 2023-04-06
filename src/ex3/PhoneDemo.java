package ex3;
public class PhoneDemo {
  public static void main(String[] args) {
    System.out.println("생성된 전화기 수 : "+Phone.getNumberOfPhone());
    Phone myPhone = new Phone();
    System.out.println("생성된 전화기 수 : "+Phone.getNumberOfPhone());
    Phone urPhone = new Phone();
    System.out.println("생성된 전화기 수 : "+myPhone.getNumberOfPhone());
    Phone urPhone2 = new Phone();
    System.out.println("생성된 전화기 수 : "+urPhone.getNumberOfPhone());
    System.out.println("생성된 전화기 수 : "+urPhone2.getNumberOfPhone());

    myPhone.setModel("삼성");
    myPhone.setPrice(100);
    myPhone.print();

    urPhone.setModel("애플");
    urPhone.setPrice(200);
    urPhone.print();
  }
}
class Phone{
  private static int numberOfPhone = 0;
  Phone(){
    numberOfPhone++;
  }
  private String model;
  private int price;

  static int getNumberOfPhone() {
    return numberOfPhone;
  }

  void print(){
    System.out.println(price + "만원 짜리 "+model+"스마트폰");
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getModel() {
    return model;
  }
}
