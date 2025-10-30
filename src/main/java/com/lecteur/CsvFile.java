package main.java.com.lecteur;

import java.io.File;
import java.io.FileInputStream;

public class CsvFile extends CustomFile {

  public CsvFile(File f) {
    super(f);
    this.decode();
  }

  protected void decode() {
    try {
      FileInputStream in = new FileInputStream(this.file);
      int i = in.read();
      String tampon = new String();

      while (i != -1) {
        // System.out.println(i + " = " + ((char) i));

        if (i != 44) {
          if (i == 10) {
            this.text.add(tampon);
            tampon = new String();
          } else {
            tampon += (char) i;
          }
        } else {
          tampon += " ";
        }
        i = in.read();
      }
      in.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
  }

}
