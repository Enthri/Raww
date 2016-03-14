package com.troi.raww.logic.gates;

import com.troi.raww.error.ErrorHandler;
import java.util.ArrayList;

public class GatePath {

  private String name;
  private boolean state;
  private ArrayList<GateSource> sources;

  public GatePath(String name) {
    this(name, false);
  }

  public GatePath(String name, boolean state) {
    this.name = name;
    this.state = state;
    this.sources = new ArrayList<GateSource>();
  }

  public void addSource(GateMask mask) {
    sources.add(new GateSource(mask));
  }

  public void setState(GateMask mask, boolean state) {
    boolean newState = false;
    for(GateSource source : sources) {
      if(source.getSource() == mask && source.currentState() != state) source.setState(state);
      newState = newState || source.currentState();
    }
    if(newState != this.state) {
      this.state = newState;
      for(GateSource source : sources) {
        source.getSource().getGate().update(this, source.getSource());
      }
    }
  }

  public boolean currentState() {
    return this.state;
  }

  public String getName() {
    return this.name;
  }
}
