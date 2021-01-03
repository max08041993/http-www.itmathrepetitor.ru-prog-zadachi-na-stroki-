package Strings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class twenty_sexTask {
    public static void main(String[] args) throws IOException {
        System.out.println("26. ");
        String string = Files.lines(Paths.get("text.txt")).reduce("",String::concat);
    }
}
