package com.troi.raww.logic.gates;

import com.troi.raww.logic.LogicHandler;

public class GateMask {

  private LogicHandler logicInstance;
  private LogicGates gate;
  private String[] param;

  public GateMask(LogicGates gate, LogicHandler instance) {
    this(gate, null, instance);
  }

  public GateMask(LogicGates gate, String[] param, LogicHandler instance) {
    this.logicInstance = instance;
    this.gate = gate;
    this.param = param;
  }

  public LogicGates getGate() {
    return this.gate;
  }

  public LogicHandler getLogicInstance() {
    return this.logicInstance;
  }
}
