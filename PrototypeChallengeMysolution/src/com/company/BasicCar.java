package com.company;

import java.util.Random;

public abstract class BasicCar implements Cloneable{
  protected String modelName;

  public int price;

  public String getModelName() {
    return modelName;
  }

  public static int setPrice() {
    int price = 0;
    Random r = new Random();
    price = r.nextInt(100000);
    return price;
  }

  public BasicCar clone() throws CloneNotSupportedException {
    return (BasicCar)super.clone();
  }
}
