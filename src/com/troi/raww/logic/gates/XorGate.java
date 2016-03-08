package com.troi.raww.logic.gates;

public class XorGate extends LogicGates {

  @Override
  public String getCommand() {
    return "xor";
  }

  @Override
  public boolean hasParam() {
    return true;
  }
}
