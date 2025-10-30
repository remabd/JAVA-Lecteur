package main.java.com.lecteur;

import java.io.File;

public class FileReader {

  public static void main(String[] args) {
    try {

      File file = new File("file/text.txt");
      TextFile textFile = new TextFile(file);
      // System.out.println(textFile.lireEndroit());
      // System.out.println(textFile.lireEnvers());
      // System.out.println(textFile.lirePalindrome());

      file = new File("file/csv.csv");
      CsvFile csvFile = new CsvFile(file);
      // System.out.println(csvFile.lireEndroit());
      // System.out.println(csvFile.lireEnvers());
      // System.out.println(csvFile.lirePalindrome());

      file = new File("file/json.json");
      JsonFile jsonFile = new JsonFile(file);
      // System.out.println(jsonFile.lireEndroit());
      // System.out.println(jsonFile.lireEnvers());
      // System.out.println(jsonFile.lirePalindrome());

    } catch (Exception e) {
      System.out.println(e);
    }

  }
}
