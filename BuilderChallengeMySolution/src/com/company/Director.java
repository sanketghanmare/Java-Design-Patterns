package com.company;

public class Director {
  MealBuilderInterface myMeal;

  public void construct(MealBuilderInterface builder) {
    myMeal = builder;
    myMeal.buildBurger();
    myMeal.buildDrink();
    myMeal.getMeal();
  }
}
