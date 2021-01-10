package old.TaskStrings;

import java.util.Scanner;

public class fourteenTask {
    public static void main(String[] args) {
        System.out.println("В данной строке найти количество цифр.");
        Scanner scanner=new Scanner(System.in);
        char[] string = scanner.nextLine().toCharArray();
        int count=0;
        for (char c : string) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        System.out.println("Количество цифр в строке равно: " + count);
    }
}
