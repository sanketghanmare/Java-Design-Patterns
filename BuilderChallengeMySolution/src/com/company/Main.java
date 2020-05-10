package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***\n");

        Director director = new Director();

        MealBuilderInterface mealVeg = new VegMealBuilder();
        MealBuilderInterface mealNonVeg = new NonVegMealBuilder();

        //Making veg meal
        director.construct(mealVeg);
        Meal vegMeal = mealVeg.getMeal();

        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost:" + vegMeal.getCost());

        //Making non veg meal
        director.construct(mealNonVeg);
        Meal nonvegMeal = mealNonVeg.getMeal();

        System.out.println("Non Veg Meal");
        nonvegMeal.showItems();
        System.out.println("Total Cost:" + nonvegMeal.getCost());
    }
}
