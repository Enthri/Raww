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

  public boolean currentState() {
    return this.state;
  }

  public void setState(GateMask mask, boolean state) {
    boolean prevState = state;
    for(GateSource source : sources) {
      source.currentState()
    }
  }
}
