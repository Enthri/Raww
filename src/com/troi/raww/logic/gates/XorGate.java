package com.troi.raww.logic.gates;

import com.troi.raww.logic.LogicHandler;
import com.troi.raww.error.ErrorHandler;

public class XorGate extends LogicGates {

  @Override
  public void update(GatePath path, GateMask gate) {
    String[] param = gate.getParameters();
    LogicHandler logic = gate.getLogicInstance();
    if(!path.getName().equals(param[2])) {
      
    }
  }

  @Override
  public void onCreation(GateMask gate) {
    String[] param = gate.getParameters();
    if(param.length != 3) ErrorHandler.printError("Invalid parameters for XOR gate on line " + gate.line());
    for(String p : param) {
      GatePath path = gate.getLogicInstance().getGatePath(p);
      if(path != null) path.addSource(gate);
      else ErrorHandler.printError("Cannot find path " + p + " for line " + gate.line());
    }
  }

  @Override
  public String getCommand() {
    return "xor";
  }

  @Override
  public byte paramType() {
    return LogicGates.PARAM_TRUE;
  }
}
