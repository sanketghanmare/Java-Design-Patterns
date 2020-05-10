package com.company;

import java.util.Hashtable;

public class BasicCarCache {
  private static final Hashtable<String,BasicCar> basicCarMap = new Hashtable<>();

  public static BasicCar getBasicCar(String carName) throws CloneNotSupportedException {
    BasicCar cachedCar = basicCarMap.get(carName);
    return (BasicCar) cachedCar.clone();
  }

  public static void loadCar() {
    Nano nano = new Nano("Nano");
    nano.price = 12340;
    basicCarMap.put("Nano",nano);

    Ford ford = new Ford("Ford");
    ford.price = 21240;
    basicCarMap.put("Ford",ford);
  }

}
