package com.promineotech.Fruit.model;

import java.util.Objects;

public class RepeatingFruit implements Comparable<RepeatingFruit> {
    private String repeatingChar;
    private String fruit;
    
    public RepeatingFruit(String fruit) {
      this.fruit = Objects.requireNonNull(fruit, "Name must not be null!");
      this.repeatingChar = findRepeatingChar(fruit);
      Objects.requireNonNull(this.repeatingChar,
          "The fruit " + fruit + " must have one or more repeating characters!");
    }
    
    public static boolean hasRepeatingCharacter(String name) {
      return findRepeatingChar(name) != null;
    }

    public String getRepeatingChar() {
      return repeatingChar;
    }

    public String getFruit() {
      return fruit;
    }

    private static String findRepeatingChar(String fruit) {
      if(Objects.isNull(fruit)|| fruit.trim().isEmpty() ) {
        throw new RuntimeException("Name must not be null or empty");
      }
      
      String trimmed = fruit.trim();
      char lastChar = fruit.charAt(0);
      
      for(int index = 1; index < trimmed.length(); index++) {
       char thisChar = fruit.charAt(index);
       
       if(lastChar == thisChar) {
         return Character.toString(thisChar);
       }
       lastChar = thisChar;
      }
      return null;
    }

    @Override
    public int compareTo(RepeatingFruit that) {
      int cmp = this.repeatingChar.compareTo(that.repeatingChar);
      
      if(cmp == 0) {
        cmp = this.fruit.compareTo(that.fruit);
      }
      
      return cmp;
    }

    @Override
    public String toString() {
      return "RepeatingFruit [repeatingChar=" + repeatingChar + ", fruit=" + fruit + "]";
    }

  }

