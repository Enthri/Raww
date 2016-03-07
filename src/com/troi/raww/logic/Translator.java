package com.troi.raww.logic;

import com.troi.raww.logic.gates.GateMask;
import com.troi.raww.logic.gates.LogicGates;
import java.util.ArrayList;

public class Translator {

  public static GateMask translateLine(String str) {
    String[] split = str.split(" ");
    for(LogicGates gate : LogicGates.gateList) {
      if(gate.getCommand().equals(split[0].toLowerCase())) return new GateMask(gate);
    }
    return null;
  }
}
