package start_20;

import org.apache.commons.lang3.ArrayUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class twentyTask {
    public static void main(String[] args) throws IOException {
        System.out.println("20. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. Крайние пробелы в строке удалить.");
        String fileName = "text.txt";
        String content = Files.lines(Paths.get(fileName)).reduce("", String::concat);
        char[] string = content.toCharArray();
        boolean key = true;
        while (key) {
            boolean key2= true;
            for (int i = 0; i < string.length - 1; i++) {
                if (string[i] == ' ' & string[i + 1] == ' ') {
                    string = ArrayUtils.remove(string, i + 1);
                    key2 = false;
                }
                if(string.length==i+2 & key2){
                    key=false;
                }
            }
        }
        System.out.println(string);
    }
}
