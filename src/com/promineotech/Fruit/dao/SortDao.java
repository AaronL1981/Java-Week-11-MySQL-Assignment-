package com.promineotech.Fruit.dao;

import java.util.ArrayList;
import java.util.List;
import com.promineotech.Fruit.model.Fruit;

public class SortDao {
  List<Fruit> fruits = new ArrayList<>(List.of(new Fruit("Apple"), new Fruit("Banana"),
      new Fruit("Cherries"), new Fruit("Orange"), new Fruit("Mango"),
      new Fruit("Lemon"), new Fruit("Grapes"), new Fruit("Watermelon")));
 
  

  public List<Fruit> getFruits() {
    return fruits;
  }

}
