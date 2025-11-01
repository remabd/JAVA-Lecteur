package main.java.com.lecteur;

import java.io.File;
import java.io.FileInputStream;

public class TextFile extends CustomFile {

  public TextFile(File f) {
    super(f);
    this.decode();
  }

  protected void decode() {
    try {
      FileInputStream in = new FileInputStream(this.file);
      int i = in.read();
      String tampon = new String();

      while (i != -1) {
        if (i == 10) {
          this.text.add(tampon);
          tampon = new String();
        } else {
          tampon += (char) i;
        }
        i = in.read();
      }
      in.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
  }

  public boolean compare(TextFile f) {
    for (int i = 0; i < f.getText().size(); i++) {
      if (!f.getText().get(i).equals(this.text.get(i))) {
        return false;
      }
    }
    return true;
  }
}
