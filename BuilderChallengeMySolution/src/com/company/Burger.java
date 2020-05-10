package com.company;

abstract class Burger implements ItemInterface{
  @Override
  public PackingInterface getPacking() {
    return new Wrapper();
  }

}

class VegBurger extends Burger {

  @Override
  public String getName() {
    return "Veg Burger";
  }

  @Override
  public double getPrice() {
    return 25.0;
  }

}

class ChickenBurger extends Burger {
  @Override
  public String getName() {
    return "Chicken Burger";
  }

  @Override
  public double getPrice() {
    return 12.50;
  }

}
