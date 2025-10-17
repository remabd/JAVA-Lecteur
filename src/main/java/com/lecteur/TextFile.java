package main.java.com.lecteur;

import java.util.ArrayList;

import java.io.File;
import java.io.FileInputStream;

public class TextFile extends CustomFile {
  private File file;
  private ArrayList<String> text;

  public TextFile() {
  };

  public TextFile(File f) {
    super(f);
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
}
