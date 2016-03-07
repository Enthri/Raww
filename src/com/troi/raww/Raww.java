package com.troi.raww;

public class Raww implements Runnable {

  public static final String VERSION = "0.0.1a";

  private static Raww instance;

  @Override
  public void run() {
    System.out.println("Hello World");
  }

  public static void main(String[] args) {
    (new Thread((instance = new Raww()))).start();
  }

  public static Raww getInstance() {
    return instance;
  }
}
