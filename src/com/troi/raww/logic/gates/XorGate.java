package com.troi.raww.logic.gates;

public class XorGate extends LogicGates {

  @Override
  public void update(GatePath path, GateMask gate) {

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
