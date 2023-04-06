package ex3;

public class CarTest {
  public static void main(String[] args) {
    Car c1 = new Car("red");
    Car c2 = new Car("blue");
    Car c3 = new Car("RED");

    System.out.printf("자동차 수 : %d 빨간색 자동차 수 : %d", Car.getNumOfCar(), Car.getNumOfRedCar());
  }
  static class Car{
    private String color;
    private static int numOfCar;
    private static int numOfRedCar;
    public Car(String color) {
      this.color = color;
      this.numOfCar++;
      if(this.color.equalsIgnoreCase("RED")) {
      this.numOfRedCar++;
      }
    }

    public static int getNumOfCar() {
      return numOfCar;
    }

    public static int getNumOfRedCar() {
      return numOfRedCar;
    }

    public String getColor() {
      return color;
    }

    public void setColor(String color) {
      this.color = color;
    }
  }
}
