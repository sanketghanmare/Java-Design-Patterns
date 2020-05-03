package FactoryMethodChallenge;

public class AninmalFactory {
  public static AnimalInterface getAnimal(String animal) {
    if (animal == null) {
      return null;
    } else if (animal.equalsIgnoreCase("duck")) {
      return new Duck();
    } else if (animal.equalsIgnoreCase("tiger")) {
      return new Tiger();
    } else {
      return null;
    }
  }
}
