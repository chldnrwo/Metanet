package ex6.Generic;

import ex6.Beer;
import ex6.Boricha;

public class GenericClassDemo2 {
  public static void main(String[] args) {
    Cup<Beer> cup = new Cup<>();

    cup.setBeverage(new Beer());
    Beer beer = cup.getBeverage();

    //cup.setBeverage(new Boricha());

    Cup<Boricha> cup2 = new Cup<>();

    cup2.setBeverage(new Boricha());
    Boricha boricha = cup2.getBeverage();

  }
}