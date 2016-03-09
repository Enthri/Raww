package com.troi.raww.logic.gates;

import java.util.ArrayList;

public abstract class LogicGates {

  public static final ArrayList<LogicGates> gateList = new ArrayList<LogicGates>();

  public LogicGates() {
    gateList.add(this);
  }

  public boolean containParam() {
    return false;
  }

  public abstract String getCommand();
  public abstract boolean hasParam();

  public static final LogicGates comment = new Comment(); //no parameters
  public static final LogicGates xorGate = new XorGate(); //PARAM;: I: A, B; O: C
}
