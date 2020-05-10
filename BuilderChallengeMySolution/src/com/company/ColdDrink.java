package com.company;

abstract class ColdDrink implements ItemInterface{

  @Override
  public PackingInterface getPacking() {
    return new Bottle();
  }
}

class Pepsi extends ColdDrink {

  @Override
  public String getName() {
    return "Pepsi";
  }

  @Override
  public double getPrice() {
    return 35.0;
  }
}

class Coke extends ColdDrink {


  @Override
  public String getName() {
    return "Coke";
  }

  @Override
  public double getPrice() {
    return 30.0;
  }
}

