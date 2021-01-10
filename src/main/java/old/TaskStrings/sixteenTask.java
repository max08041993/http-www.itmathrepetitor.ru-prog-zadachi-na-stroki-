package old.TaskStrings;

import java.util.Scanner;

public class sixteenTask {
    public static void main(String[] args) {
        System.out.println("16. Замените в строке все вхождения 'word' на 'letter'.");
        Scanner scanner=new Scanner(System.in);
        String string = scanner.nextLine().replaceAll("word","letter");
        System.out.println(string);
    }
}
