package com.company;

public interface PackingInterface {
  public String pack();
}

class Wrapper implements PackingInterface {

  @Override
  public String  pack() {
     return "Wrapper";
  }
}

class Bottle implements PackingInterface {

  @Override
  public String pack() {
     return "Bottle";
  }
}
