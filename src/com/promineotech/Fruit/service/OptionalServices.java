package com.promineotech.Fruit.service;

import java.util.NoSuchElementException;
import com.promineotech.Fruit.dao.OptionalDao;

public class OptionalServices {
  private OptionalDao dao = new OptionalDao();
  public String find(String search) {
    return dao.find(search).orElseThrow(() -> new NoSuchElementException(
         "It appears that a name of a fruit is missing."));
    
  }


}
