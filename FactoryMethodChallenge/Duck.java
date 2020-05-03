package FactoryMethodChallenge;

public class Duck implements AnimalInterface{
  @Override
  public String animalSound() {
    return "In duck: Says Quak.. Quak";
  }
}
