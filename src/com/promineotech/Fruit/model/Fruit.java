package com.promineotech.Fruit.model;

public class Fruit {
  private String fruit;
  
  public Fruit(String name) {
    this.fruit = name;
  }

  @Override
  public String toString() {
    return fruit;
  }

  public String getFruit() {
    return fruit;
  }

  public static int compareFruits(Fruit f1, Fruit f2) {
    return f1.fruit.compareTo(f2.fruit);
  }
  
}
