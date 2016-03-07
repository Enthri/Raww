package com.troi.raww.logic.gates;

public class GateMask {

  private LogicGates gate;
  private String[] param;

  public GateMask(LogicGates gate) {
    this(gate, null);
  }

  public GateMask(LogicGates gate, String[] param) {
    this.gate = gate;
    this.param = param;
  }

  public LogicGates getGate() {
    return gate;
  }
}
