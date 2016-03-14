package com.troi.raww.logic.gates;

import com.troi.raww.logic.LogicHandler;

public class Comment extends LogicGates {

  @Override
  public void update(GatePath path, GateMask gate) {
  }

  @Override
  public void onCreation(GateMask gate) {
  }

  @Override
  public String getCommand() {
    return "#";
  }

  @Override
  public byte paramType() {
    return LogicGates.PARAM_CONTAIN_F;
  }
}
