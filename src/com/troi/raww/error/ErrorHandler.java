package com.troi.raww.error;

public class ErrorHandler {

  public static void printError(String string) {
    System.out.println("[ERROR] " + string);
    System.exit(0);
  }
}
