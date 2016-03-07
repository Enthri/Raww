package com.troi.raww.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

  public static void readFile(File... files) {
    BufferedReader read = null;
    for(File file : files) {
      try {
        read = new BufferedReader(new FileReader(file));
        String line;
        if(file.exists()) {
          while((line = read.readLine()) != null) {
          }
        }
      } catch(Exception e) {
      } finally {
        try { if(read != null) read.close();
        } catch(IOException e) { }
      }
    }
  }
}
