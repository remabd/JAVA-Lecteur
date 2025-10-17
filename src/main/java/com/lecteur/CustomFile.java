package main.java.com.lecteur;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public abstract class CustomFile implements Readable {
  private File file;
  private ArrayList<String> text;

  public CustomFile() {
  };

  public CustomFile(File f) {
    this.text = new ArrayList<>();
    this.file = f;
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
