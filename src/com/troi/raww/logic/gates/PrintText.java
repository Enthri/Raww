package com.troi.raww.logic.gates;

import com.troi.raww.logic.LogicHandler;
import com.troi.raww.error.ErrorHandler;

public class PrintText extends LogicGates {

  @Override
  public void update(GatePath path, GateMask gate) {
    if(path.currentState()) System.out.println("[PRINT] " + gate.getParameters()[0]);
  }

  @Override
  public void onCreation(GateMask gate) {
    String[] param = gate.getParameters();
    if(param.length < 1 || param.length > 6) ErrorHandler.printError("Invalid parameters for print gate on line " + gate.line());
    for(int i = 1; i < param.length; i++) {
      GatePath path = gate.getLogicInstance().getGatePath(param[i]);
      if(path != null) path.addSource(gate);
      else ErrorHandler.printError("Cannot find path " + param[i] + " for line " + gate.line());
    }
  }

  @Override
  public String getCommand() {
    return "print";
  }

  @Override
  public byte paramType() {
    return LogicGates.PARAM_TRUE;
  }
}
