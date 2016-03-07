package com.troi.raww.logic;

import com.troi.raww.io.RawwFile;
import com.troi.raww.logic.gates.*;
import java.util.ArrayList;

public class LogicHandler {

  private ArrayList<RawwFile> files;
  private ArrayList<GateMask> gates;

  public LogicHandler(ArrayList<RawwFile> files) {
    this.files = files;
  }

  public void run() {
    System.out.println(Translator.translateLine(files.get(0).getLines().get(0)).getGate().getCommand());
  }
}
