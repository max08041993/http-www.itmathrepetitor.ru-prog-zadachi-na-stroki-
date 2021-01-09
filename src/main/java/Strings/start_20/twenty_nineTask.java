package Strings.start_20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class twenty_nineTask {
    public static void main(String[] args) throws IOException {
        System.out.println("29. Дана строка. Заменить все символы 'a' и 'b' на 'A' и 'B' соответственно.");
        char[] string = Files.lines(Paths.get("text.txt")).reduce("",String::concat).toCharArray();
        for (int i = 0;i<string.length;i++){
            if (string[i]=='a'|string[i]=='b'){
                string[i]=Character.toUpperCase(string[i]);
            }
        }
        System.out.println(string);
    }
}
