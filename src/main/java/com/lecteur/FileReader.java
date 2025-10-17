package main.java.com.lecteur;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.io.File;

public class FileReader {

  public static void main(String[] args) {
    File f = new File("file/test.txt");
    // try {
    // FileInputStream in = new FileInputStream(f);
    // int i = in.read();
    // while (i != -1) {
    // System.out.println((char) i);
    // i = in.read();
    // }
    // in.close();
    // } catch (Exception e) {
    // e.getStackTrace();
    // }

    TextFile TF = new TextFile(f);
    TF.decode();
    String result = TF.lireEndroit();
    String tluser = TF.lireEnvers();
    String palin = TF.lirePalindrome();
    System.out.println(result);
    System.out.println(tluser);
    System.out.println(palin);
  }

}
