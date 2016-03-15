package com.troi.raww.logic.gates;

import com.troi.raww.logic.LogicHandler;
import com.troi.raww.error.ErrorHandler;

public class EternalSource extends LogicGates {

  @Override
  public void update(GatePath path, GateMask gate) {
  }

  @Override
  public void onCreation(GateMask gate) {
    String[] param = gate.getParameters();
    if(param.length < 1 || param.length > 5) ErrorHandler.printError("Invalid parameters for path on line " + gate.line());
    for(String p : param) {
      GatePath path = gate.getLogicInstance().getGatePath(p);
      if(path != null) {
        path.addSource(gate);
        path.setState(gate, true);
      } else ErrorHandler.printError("Cannot find path " + p + " for line " + gate.line());
    }
  }

  @Override
  public String getCommand() {
    return "!";
  }

  @Override
  public byte paramType() {
    return LogicGates.PARAM_CONTAIN;
  }
}
