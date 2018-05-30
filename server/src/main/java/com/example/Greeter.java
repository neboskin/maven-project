package com.example;

public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

/**
* @param someone name 
* @return String with hello and name
*/ 
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}

