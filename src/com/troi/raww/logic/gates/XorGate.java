package com.troi.raww.logic.gates;

import com.troi.raww.logic.LogicHandler;

public class XorGate extends LogicGates {

  @Override
  public void update(GatePath path, GateMask gate) {
  }

  @Override
  public void onCreation(GateMask gate) {
    System.out.println(this.getCommand());
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
