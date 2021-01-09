package Strings.start_20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class twenty_fiveTask {
    public static void main(String[] args) throws IOException {
        System.out.println("25. Дан текст. Найдите наибольшее количество подряд идущих пробелов в нем.");
        String string = Files.lines(Paths.get("text.txt")).reduce("",String::concat);
        char[] var=string.toCharArray();
        System.out.println(var);
        int count=0;
        int result=0;
        for (char c : var) {
            if (c == ' ') {
                count++;
                System.out.println(count);
                if (count > result) {
                    result = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println("Наибольшее количество пробелов между словами в строке составляет: " + result);
    }
}
