import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class twentyTwoTask {
    public static void main(String[] args) throws IOException {
        System.out.println("22. Дан текст. Найдите наибольшее количество идущих подряд цифр.");
        String str = Files.lines(Paths.get("text.txt")).reduce("",String::concat);
        System.out.println(str);
        char[] string = str.toCharArray();
        int sum =0;
        int key=0;
        for (char c : string) {
            if (Character.isDigit(c)) {
                key++;
                if (key > sum) {
                    sum = key;
                }
            } else if (c == ' ') {
                key = 0;
            }
        }
        System.out.println("Наибольшее количество чисел стоящих рядом составляет: "+sum);
    }
}
