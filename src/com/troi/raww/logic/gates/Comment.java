package com.troi.raww.logic.gates;

public class Comment extends LogicGates {

  @Override
  public String getCommand() {
    return "#";
  }

  @Override
  public boolean hasParam() {
    return false;
  }

  @Override
  public boolean containParam() {
    return true;
  }
}
