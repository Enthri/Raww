package com.troi.raww.logic.gates;

public class GateSource {

  private GateMask source;
  private boolean state;

  public GateSource(GateMask source) {
    this(source, false);
  }

  public GateSource(GateMask source, boolean state) {
    this.source = source;
    this.state = state;
  }

  public void setState(boolean flag) {
    this.state = flag;
  }

  public GateMask getSource() {
    return this.source;
  }

  public boolean currentState() {
    return this.state;
  }
}
