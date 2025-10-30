package main.java.com.lecteur;

import java.io.File;

public class FileReader {

  public static void main(String[] args) {
    try {

      File file = new File("file/text.txt");
      TextFile textFile = new TextFile(file);
      textFile.decode();
      System.out.println(textFile.lireEndroit());
      System.out.println(textFile.lireEnvers());
      System.out.println(textFile.lirePalindrome());
      // System.out.println(result);
      // System.out.println(envers);
      // System.out.println(palin);

      file = new File("file/csv.csv");
      CsvFile csvFile = new CsvFile(file);
      csvFile.decode();
      System.out.println(csvFile.getText());
      System.out.println(csvFile.lireEndroit());
      System.out.println(csvFile.lireEnvers());
      System.out.println(csvFile.lirePalindrome());

    } catch (Exception e) {
      System.out.println(e);
    }

  }
}
