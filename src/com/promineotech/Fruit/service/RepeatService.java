package com.promineotech.Fruit.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.promineotech.Fruit.dao.RepeatDao;
import com.promineotech.Fruit.model.RepeatingFruit;


public class RepeatService {
private RepeatDao repeatDao = new RepeatDao();
  
  public Map<String, List<RepeatingFruit>> findRepeatingFruit() {
    // @formatter:off
    return repeatDao.getFruits().stream()
          .filter(RepeatingFruit::hasRepeatingCharacter)
          .map(RepeatingFruit::new)
          .sorted()
          .collect(Collectors.groupingBy(RepeatingFruit::getRepeatingChar));
    //@formatter:on
  }
}
