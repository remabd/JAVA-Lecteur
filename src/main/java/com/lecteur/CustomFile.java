package com.lecteur;

import java.io.File;
import java.io.FileInputStream;

public abstract class CustomFile {
  private File file;

  public CustomFile() {
  };

  public CustomFile(File f) {
    this.file = f;
  }

  // public String[] lire() {
  // }
  //
  // public String[] lireEnvers() {
  // }
  //
  // public String[] lirePalindrome() {
  // }

}
