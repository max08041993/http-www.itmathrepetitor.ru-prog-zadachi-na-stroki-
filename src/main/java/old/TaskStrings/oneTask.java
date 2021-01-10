package old.TaskStrings;

import java.util.Scanner;

public class oneTask {
    public static void main(String[] args) {
        System.out.println("Дана строка. Вывести ее три раза через запятую и показать количество символов в ней.");
        System.out.println("Введите строчку:");
        Scanner scanner = new Scanner(System.in);
        String var = scanner.nextLine();
        System.out.println(var + ", " + var + ", " + var);
        int quantity=0;
        for (int i=1;i<=var.length();i++){
            quantity++;
        }
        System.out.println("Количество символов в строке: "+quantity);
    }
}
