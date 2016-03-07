package com.troi.raww.logic.gates;

import java.util.ArrayList;

public abstract class LogicGates {

  public static ArrayList<LogicGates> gateList = new ArrayList<LogicGates>();

  public LogicGates() {
    gateList.add(this);
  }

  public abstract String getCommand();

  public static final LogicGates comment = new Comment();
}
