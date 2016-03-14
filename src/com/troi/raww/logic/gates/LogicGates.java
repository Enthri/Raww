package com.troi.raww.logic.gates;

import java.util.ArrayList;

public abstract class LogicGates {

  public static final ArrayList<LogicGates> gateList = new ArrayList<LogicGates>();

  public static final byte PARAM_FALSE = 0;
  public static final byte PARAM_TRUE = 1;
  public static final byte PARAM_CONTAIN = 2;
  public static final byte PARAM_CONTAIN_F = 3;

  public LogicGates() {
    gateList.add(this);
  }

  //public abstract void update();
  public abstract String getCommand();
  public abstract byte paramType();

  public static final LogicGates comment = new Comment(); //no parameters
  public static final LogicGates xorGate = new XorGate(); //PARAM;: I: A, B; O: C
}
