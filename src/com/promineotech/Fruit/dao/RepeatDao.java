package com.promineotech.Fruit.dao;

import java.util.List;


public class RepeatDao {
  List<String> Fruits = List.of("Apple","Banana","Cherries","Orange","Mango",
                                "Lemon","Grapes","Watermelon","Banana","Cherries",
                                "Blackberry","Pinapple","Litchee","Cape Gooseberry",
                                "Passionfruit");

  public List<String> getFruits() {
    return Fruits;
  }
}
