package com.troi.raww.logic;

import com.troi.raww.error.ErrorHandler;
import com.troi.raww.io.RawwFile;
import com.troi.raww.logic.gates.GateMask;
import com.troi.raww.logic.gates.GatePath;
import java.util.ArrayList;

public class LogicHandler {

  private ArrayList<RawwFile> files;
  private ArrayList<GateMask> gates;
  private ArrayList<GatePath> paths;

  public LogicHandler(ArrayList<RawwFile> files) {
    this.files = files;
    this.gates = new ArrayList<GateMask>();
    this.paths = new ArrayList<GatePath>();
  }

  public void run() {
    for(RawwFile file : files) {
      for(int i = 0; i < file.getLines().size(); i++) {
        String line = file.getLines().get(i);
        GateMask mask = Translator.translateLine(line, this);
        if(mask != null) {
          mask.setLine(i + 1);
          mask.getGate().onCreation(mask);
          gates.add(mask);
        }
        else ErrorHandler.printError("Syntax error on line " + (i + 1));
      }
    }
  }

  public GatePath createGatePath(String name) {
    GatePath path = new GatePath(name);
    paths.add(path);
    return path;
  }

  public GatePath getGatePath(String name) {
    for(GatePath path : paths) {
      if(path.getName().equals(name)) return path;
    }
    return null;
  }
}
