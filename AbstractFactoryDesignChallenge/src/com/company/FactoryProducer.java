package com.company;

public class FactoryProducer {
  public static AbstractFactory getFactory(String choice) {
    if (choice.equalsIgnoreCase("Bollywood")) {
      return new BollywoodMovieFactory();
    } else if (choice.equalsIgnoreCase("Hollywood")) {
      return new HollywoodMovieFactory();
    } else {
      return null;
    }
  }
}
