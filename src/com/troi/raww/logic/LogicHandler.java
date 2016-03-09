package com.troi.raww.logic;

import com.troi.raww.io.RawwFile;
import com.troi.raww.logic.gates.GateMask;
import java.util.ArrayList;

public class LogicHandler {

  private ArrayList<RawwFile> files;
  private ArrayList<GateMask> gates;

  public LogicHandler(ArrayList<RawwFile> files) {
    this.files = files;
    this.gates = new ArrayList<GateMask>();
  }

  public void run() {
    for(RawwFile file : files) {
      for(int i = 0; i < file.getLines().size(); i++) {
        String line = file.getLines().get(i);
        GateMask mask = Translator.translateLine(line);
        if(mask != null) gates.add(mask);
        else {
          System.out.println("Syntax error on line " + (i + 1));
          return;
        }
      }
    }
    for(GateMask mask : gates) {
      System.out.println(mask.getGate().getCommand());
    }
  }
}
