package com.troi.raww.logic;

import com.troi.raww.io.RawwFile;
import java.util.ArrayList;

public class LogicHandler {

  private ArrayList<RawwFile> files;

  public LogicHandler(ArrayList<RawwFile> files) {
    this.files = files;
  }

  public void run() {
    System.out.println(files.get(0).getLines().get(0));
  }
}
