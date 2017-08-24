package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

/**
* @param someone String someone name of a person
* @return greetings string greetings
*/
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
