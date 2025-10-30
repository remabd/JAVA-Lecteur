package main.java.com.lecteur;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public abstract class CustomFile implements Readable {
  protected File file;
  protected ArrayList<String> text;

  public CustomFile(File f) {
    this.file = f;
    this.text = new ArrayList<String>();
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

  public abstract void decode();

  public ArrayList<String> getText() {
    return this.text;
  }
}
