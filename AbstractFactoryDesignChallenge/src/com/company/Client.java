package com.company;

/**
 * Author:- Sanket Ghanmare
 * Date:- 04/May/2020
 * Design Pattern:- Abstract Factory Design Pattern Example.
 */
public class Client {

  public static void main(String[] args) {
    AbstractFactory bollywood = FactoryProducer.getFactory("Bollywood");

    IBollywoodMovie b1 = bollywood.getBollywoodMovieName("action");
    b1.getBollywoodMovieName();

    IBollywoodMovie b2 = bollywood.getBollywoodMovieName("comedy");
    b2.getBollywoodMovieName();

    AbstractFactory hollywood = FactoryProducer.getFactory("Hollywood");

    IHollywoodMovie h1 = hollywood.getHollywoodMovieName("action");
    h1.getHollywoodMovieName();

    IHollywoodMovie h2 = hollywood.getHollywoodMovieName("comedy");
    h2.getHollywoodMovieName();
  }
}
