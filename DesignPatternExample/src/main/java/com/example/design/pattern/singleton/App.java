package com.example.design.pattern.singleton;


public class App {

  /**
   * Program entry point.
   *
   * @param args command line args
   */
  public static void main(String[] args) {

    // double checked locking
    RestarauntOpening openRestaraunt = RestarauntOpening.getInstance();
    System.out.println(openRestaraunt);
    RestarauntOpening openRestarauntAgain = RestarauntOpening.getInstance();
    System.out.println(openRestarauntAgain);

  }
}
