package com.promineotech.Fruit.service;

import java.util.Comparator;
import java.util.List;
import com.promineotech.Fruit.dao.SortDao;
import com.promineotech.Fruit.model.Fruit;

public class SortService {
  private SortDao sortDao = new SortDao();
  
  public List<Fruit> getFruits(SortType type) {
    List<Fruit> fruits = sortDao.getFruits();
    Comparator<Fruit> comp = null;
    
    switch(type) {
      case LAMBDA:
        comp = (f1, f2) -> Fruit.compareFruits(f1, f2);
        
        break;
        
      case METHOD_REFERENCE:
        comp = Fruit::compareFruits;
        break;
        
      case NORMAL_CLASS:
        comp = new MyFruit();
        break;
        
      default:
        throw new RuntimeException("Unhandled sort type: " + type);
    
    
  }
    fruits.sort(comp);
    return fruits;
}

  static class MyFruit implements Comparator<Fruit> {

    @Override
    public int compare(Fruit f1, Fruit f2) {
      return Fruit.compareFruits(f1, f2);
    }
  }
 } 
 