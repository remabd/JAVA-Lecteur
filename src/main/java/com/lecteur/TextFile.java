package com.lecteur;

import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;

public class TextFile {
  private ArrayList<String> text;
  private File file;
  private int currentIndex;

  public TextFile() {
  };

  public TextFile(File f) {
    this.file = f;
    this.text = new ArrayList<String>();
    this.currentIndex = 0;
  }

  public void decode() {
    try {
      FileInputStream in = new FileInputStream(this.file);
      int i = in.read();
      String tampon = new String();

      while (i != -1) {
        if (i == 10) {
          this.text.add(tampon);
          tampon = new String();
        }
        tampon += (char) i;
        i = in.read();
      }
      in.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
  }

  public String lireEndroit() {
    String resultat = new String();
    for (String ligne : this.text) {
      resultat += "\n" + ligne;
    }
    return resultat;
  }

  public String lireEnvers() {
    String resultat = new String();
    for (int i = text.size() - 1; i >= 0; i--) {
      resultat += "\n" + this.text.get(i);
    }
    return resultat;
  }

  public String lirePalindrome() {
    String resultat = new String();
    for (String ligne : this.text) {
      for (int i = ligne.length() - 1; i >= 0; i--) {
        resultat += ligne.toCharArray()[i];
      }
      resultat += "\n";
    }
    return resultat;
  }
}
