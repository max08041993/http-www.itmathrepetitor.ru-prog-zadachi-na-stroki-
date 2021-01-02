import org.apache.commons.lang3.ArrayUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class twentyOneTask {
    public static void main(String[] args) {
        System.out.println("21. Дана строка, состоящая из слов, разделенных символами, которые перечислены во второй строке. Показать все слова.");
        Scanner scanner = new Scanner(System.in);
        try {
           String content = Files.lines(Paths.get("text.txt")).reduce("", String::concat);
            char[] string = content.toCharArray();
            System.out.println("Введите символы, которые могут разделять слова в строке");
            char[] sim= scanner.nextLine().toCharArray();
            for (int i=0;i<string.length;i++){
                for (char key:sim){
                    if (string[i] == key) {
                        string[i] = ' ';
                        break;
                    }
                }
            }
            System.out.println(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
