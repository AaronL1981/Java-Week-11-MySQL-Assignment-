package com.promineotech.Fruit;

import java.util.List;
import com.promineotech.Fruit.model.Fruit;
import com.promineotech.Fruit.service.SortService;
import com.promineotech.Fruit.service.SortType;

public class MyFruit {
  private SortService sortService = new SortService();
  
  public static void main(String[] args) {
    new MyFruit().run();

}

  private void run() {
    List<Fruit> fruits = sortService.getFruits(SortType.METHOD_REFERENCE);
    print(fruits,SortType.METHOD_REFERENCE);
  }

  private void print(List<Fruit> fruits, SortType type) {
    switch(type) {
      case LAMBDA:
        fruits.forEach(fruit -> System.out.println(fruit.getFruit()));
        break;
        
      case METHOD_REFERENCE:
        fruits.forEach(System.out::println);
        break;
        
      case NORMAL_CLASS:
        for(Fruit fruit : fruits) {
          System.out.println(fruit.getFruit());
        }
        break;
        
      default:
        break;
      
    }
    
  }
}