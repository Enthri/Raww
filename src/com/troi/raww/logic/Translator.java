package com.troi.raww.logic;

import com.troi.raww.logic.gates.GateMask;
import com.troi.raww.logic.gates.LogicGates;
import java.util.ArrayList;
import java.util.Arrays;

public class Translator {

  public static GateMask translateLine(String str) {
    String[] split = str.split("\"?( |$)(?=(([^\"]*\"){2})*[^\"]*$)\"?");
    for(LogicGates gate : LogicGates.gateList) {
      if(gate.getCommand().equals(split[0].toLowerCase())) {
        if(gate.hasParam()) return new GateMask(gate, Arrays.copyOfRange(split, 1, split.length));
        else return new GateMask(gate);
      }
    }
    return null;
  }
}
