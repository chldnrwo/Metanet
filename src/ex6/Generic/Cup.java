package ex6.Generic;

public class Cup<T> {
  private T beverage;

  public T getBeverage() {
    return beverage;
  }

  public void setBeverage(T beverage) {
    this.beverage = beverage;
  }
}
