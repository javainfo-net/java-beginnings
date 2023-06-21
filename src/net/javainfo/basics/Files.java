package net.javainfo.basics;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class Files {

    public static void main(String[] args) throws IOException {

    //sprawdzenie lokalizacji katalogu początkowego
    String dir = System.getProperty("user.dir");
    System.out.println(dir);

    //wczytanie pliku
    Scanner in = new Scanner(Path.of(dir + "/src/net/javainfo/basics/file1.txt"), StandardCharsets.UTF_8);
    System.out.println(in.nextLine());

    //utworzenie i zapis do nowego pliku
    File file = new File("file2.txt");
    PrintWriter out = new PrintWriter(file.getName(),StandardCharsets.UTF_8);
    out.write("Zawartość testowa pliku2.");
    out.close();

    }
}
