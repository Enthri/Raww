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

  public abstract void update(GatePath path, GateMask gate);
  public abstract void onCreation(GateMask gate);
  public abstract String getCommand();
  public abstract byte paramType();

  public static final LogicGates comment = new Comment(); //no parameters
  public static final LogicGates pathVariable = new PathVariable(); //$variable
  public static final EternalSource eternalSource = new EternalSource(); //!variable variable ..
  public static final PrintText printText = new PrintText(); //print "" A
  public static final LogicGates xorGate = new XorGate(); //xor A B C
}
