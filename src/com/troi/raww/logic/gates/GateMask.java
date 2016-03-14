package com.troi.raww.logic.gates;

import com.troi.raww.logic.LogicHandler;

public class GateMask {

  private LogicHandler logicInstance;
  private LogicGates gate;
  private String[] param;

  private int line;

  public GateMask(LogicGates gate, LogicHandler instance) {
    this(gate, null, instance);
  }

  public GateMask(LogicGates gate, String[] param, LogicHandler instance) {
    this.logicInstance = instance;
    this.gate = gate;
    this.param = param;
  }

  public void setLine(int line) {
    this.line = line;
  }

  public LogicGates getGate() {
    return this.gate;
  }

  public LogicHandler getLogicInstance() {
    return this.logicInstance;
  }

  public String[] getParameters() {
    return this.param;
  }

  public int line() {
    return this.line;
  }
}
