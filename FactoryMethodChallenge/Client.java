package FactoryMethodChallenge;

public class Client {
  public static void main(String[] args) {
    AnimalInterface animal1 = AninmalFactory.getAnimal("tiger");
    System.out.println(animal1.animalSound());

    AnimalInterface animal2 = AninmalFactory.getAnimal("duck");
    System.out.println(animal2.animalSound());

    AnimalInterface animalRandom = AninmalFactory.getAnimal("Snake");
    System.out.println(animalRandom.animalSound());
  }
}
