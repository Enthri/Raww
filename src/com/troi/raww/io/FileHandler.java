package com.troi.raww.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler {

  private final ArrayList<RawwFile> fileList;

  public FileHandler() {
    this.fileList = new ArrayList<RawwFile>();
  }

  public void readFiles(String... fileNames) {
    BufferedReader read = null;
    for(String fileName : fileNames) {
      File file = new File(fileName);
      if(!file.exists()) continue;
      RawwFile rawwFile = new RawwFile(fileName);
      try {
        read = new BufferedReader(new FileReader(file));
        String line;
        while((line = read.readLine()) != null) rawwFile.addLine(line);
      } catch(Exception e) {
      } finally {
        try { if(read != null) read.close();
        } catch(IOException e) { }
      }
      this.fileList.add(rawwFile);
    }
  }

  public ArrayList<RawwFile> getFileList() {
    return this.fileList;
  }
}
