package dev.lpa;

import java.nio.file.Path;

public class Main {

  public static void main(String[] args) {

    Path path = Path.of("files/testing.txt");
    printPathInfo(path);


  }

  private static void printPathInfo(Path path) {

    System.out.println("Path: " + path);
    System.out.println("fileName = " + path.getFileName());
    System.out.println("parent = " + path.getParent());
    Path absolutePath = path.toAbsolutePath();
    System.out.println("Absolute Path: = " + absolutePath);
    System.out.println("Absolute Path Root: = " + absolutePath.getRoot());
    System.out.println("Root = " + path.getRoot()); // if null is relative path
    System.out.println("isAbsolute = " + path.isAbsolute());
    System.out.println();

    System.out.println(absolutePath.getRoot());
    int i = 1;
    var it = path.toAbsolutePath().iterator(); // NOTE: loop through directory tree
    while (it.hasNext()) {
      System.out.println(".".repeat(i++) + " " + it.next());
    }
    System.out.println("-------------------------------------------");
  }
}
