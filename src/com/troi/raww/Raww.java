package com.troi.raww;

import com.troi.raww.io.FileHandler;
import com.troi.raww.logic.LogicHandler;

public class Raww implements Runnable {

  public static final String VERSION = "0.0.1a";
  private static Raww instance;

  private FileHandler fileHandler;
  private LogicHandler logicHandler;

  @Override
  public void run() {
    this.fileHandler = new FileHandler();
    this.fileHandler.readFiles("test.raww");
    this.logicHandler = new LogicHandler(fileHandler.getFileList());
    this.logicHandler.run();
  }

  public static void main(String[] args) {
    (new Thread((instance = new Raww()))).start();
  }

  public static Raww getInstance() {
    return instance;
  }
}
