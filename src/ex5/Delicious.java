package ex5;

public interface Delicious extends Edible, Sweetable{
  @Override
  void eat();

  @Override
  void sweet();
}
