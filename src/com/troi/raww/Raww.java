package com.troi.raww;

import com.troi.raww.io.FileHandler;

public class Raww implements Runnable {

  public static final String VERSION = "0.0.1a";
  private static Raww instance;

  private FileHandler fileHandler;

  @Override
  public void run() {
    this.fileHandler = new FileHandler();
    this.fileHandler.readFiles("test.raww");
    System.out.println(fileHandler.getFileList().get(0).getLines().get(0));
  }

  public static void main(String[] args) {
    (new Thread((instance = new Raww()))).start();
  }

  public static Raww getInstance() {
    return instance;
  }
}
