package com.troi.raww.logic.gates;

public class GatePath {

  private boolean state;

  public GatePath() {
    this(false);
  }

  public GatePath(boolean state) {
    this.state = state;
  }

  public boolean currentState() {
    return this.state;
  }

  public void setState(boolean state) {
    this.state = state;
  }
}
