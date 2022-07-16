package com.promineotech.Fruit;

import java.util.NoSuchElementException;
import java.util.Scanner;
import com.promineotech.Fruit.service.OptionalServices;


public class Optionals {
  private Scanner scanner = new Scanner(System.in);
  private OptionalServices service = new OptionalServices();
  public static void main(String[] args) {
    new Optionals().run();
  }

  private void run() {
    boolean done = false;
    
    while(!done) {
      System.out.println("Enter a fruit: ");
      String search = scanner.nextLine();
      
      if(search.isEmpty()) {
        done = true;
      }
      else {
        try {
        String found = service.find(search);
        System.out.println("I found " + found + "!");
      }
        catch(NoSuchElementException e) {
          System.out.println(e.getMessage());
        }
      }
    } 
  } 

}
