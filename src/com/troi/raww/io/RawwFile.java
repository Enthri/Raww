package com.troi.raww.io;

import java.util.ArrayList;

public class RawwFile {

  private final String name;
  private final ArrayList<String> lines;

  public RawwFile() {
    this("missing_file");
  }

  public RawwFile(String name) {
    this.name = name;
    this.lines = new ArrayList<String>();
  }

  public String getName() {
    return this.name;
  }

  public ArrayList<String> getLines() {
    return this.lines;
  }

  public void addLine(String str) {
    this.lines.add(str);
  }
}
