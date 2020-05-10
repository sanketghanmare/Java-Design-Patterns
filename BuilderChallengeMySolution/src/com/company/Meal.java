package com.company;

import java.util.LinkedList;
import java.util.List;

public class Meal {
  private final List<ItemInterface> items;

  public Meal () {
    items = new LinkedList<ItemInterface>();
  }

  public void addItem(ItemInterface item) {
    items.add(item);
  }

  public double getCost() {
    double cost = 0.0;
            for(ItemInterface item: items){
              cost += item.getPrice();
            }
            return cost;
  }

  public void showItems() {
    for (ItemInterface item : items) {
      System.out.print("Item: " + item.getName());
      System.out.print(", Packing: " + item.getPacking().pack());
      System.out.println(", Price: " + item.getPrice());
    }
  }
}
