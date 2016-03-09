package com.troi.raww.logic;

import com.troi.raww.logic.gates.GateMask;
import com.troi.raww.logic.gates.LogicGates;
import java.util.ArrayList;
import java.util.Arrays;

public class Translator {

  public static GateMask translateLine(String str) {
    String[] split = str.split("\"?( |$)(?=(([^\"]*\"){2})*[^\"]*$)\"?");
    if(split.length < 1) return null;
    for(LogicGates gate : LogicGates.gateList) {
      if(gate.getCommand().equals(split[0].toLowerCase()) || (gate.containParam() && gate.getCommand().equals(split[0].toLowerCase().substring(0, gate.getCommand().length())))) {
        if(gate.hasParam() && !gate.containParam()) return new GateMask(gate, Arrays.copyOfRange(split, 1, split.length));
        else if(gate.hasParam() && gate.containParam()) {
          split[0] = split[0].substring(gate.getCommand().length());
          if(split[0].length() > 0) return new GateMask(gate, split);
          else new GateMask(gate, Arrays.copyOfRange(split, 1, split.length));
        }
        else return new GateMask(gate);
      }
    }
    return null;
  }
}
