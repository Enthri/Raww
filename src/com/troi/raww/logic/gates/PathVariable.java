package com.troi.raww.logic.gates;

import com.troi.raww.logic.LogicHandler;
import com.troi.raww.error.ErrorHandler;

public class PathVariable extends LogicGates {

  @Override
  public void update(GatePath path, GateMask gate) {
  }

  @Override
  public void onCreation(GateMask gate) {
    String[] param = gate.getParameters();
    if(param.length != 1) ErrorHandler.printError("Invalid parameters for path on line " + gate.line());
    gate.getLogicInstance().createGatePath(param[0]);
  }

  @Override
  public String getCommand() {
    return "$";
  }

  @Override
  public byte paramType() {
    return LogicGates.PARAM_CONTAIN;
  }
}
