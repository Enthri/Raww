package com.troi.raww.logic;

import com.troi.raww.logic.LogicHandler;
import com.troi.raww.logic.gates.GateMask;
import com.troi.raww.logic.gates.LogicGates;
import java.util.ArrayList;
import java.util.Arrays;

public class Translator {

  public static GateMask translateLine(String str, LogicHandler instance) {
    String[] split = str.split("\"?( |$)(?=(([^\"]*\"){2})*[^\"]*$)\"?");
    if(split.length < 1) return null;
    for(LogicGates gate : LogicGates.gateList) {
      if(gate.getCommand().equals(split[0].toLowerCase()) || (gate.paramType() >= LogicGates.PARAM_CONTAIN && gate.getCommand().equals(split[0].toLowerCase().substring(0, gate.getCommand().length())))) {
        if(gate.paramType() == LogicGates.PARAM_TRUE) return new GateMask(gate, Arrays.copyOfRange(split, 1, split.length), instance);
        else if(gate.paramType() == LogicGates.PARAM_CONTAIN) {
          split[0] = split[0].substring(gate.getCommand().length());
          if(split[0].length() > 0) return new GateMask(gate, split, instance);
          else new GateMask(gate, Arrays.copyOfRange(split, 1, split.length), instance);
        }
        else return new GateMask(gate, instance);
      }
    }
    return null;
  }
}
