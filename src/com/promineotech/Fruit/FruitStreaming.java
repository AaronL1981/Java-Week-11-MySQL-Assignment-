package com.promineotech.Fruit;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.promineotech.Fruit.model.RepeatingFruit;
import com.promineotech.Fruit.service.RepeatService;


public class FruitStreaming {
  private RepeatService repeatService = new RepeatService();
  public static void main(String[] args) {
    new FruitStreaming().run();
  }

  private void run() {
    Map<String, List<RepeatingFruit>> names = repeatService.findRepeatingFruit();    
    //@formatter:off
    names.entrySet().forEach(entry ->
    System.out.println(entry.getKey() + ": " +
        entry.getValue().stream()
            .map(RepeatingFruit::getFruit)
            .collect(Collectors.toList())));
    //@formatter:on
  }
}
