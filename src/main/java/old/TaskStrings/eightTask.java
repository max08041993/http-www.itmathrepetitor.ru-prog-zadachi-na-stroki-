package old.TaskStrings;

import java.util.Scanner;

public class eightTask {
    public static void main(String[] args) {
        System.out.println("Дана строка. Определите, какой символ в ней встречается раньше: 'x' или 'w'. Если какого-то из символов нет, вывести сообщение об этом.");
        Scanner scanner = new Scanner(System.in);
        char[] string = scanner.nextLine().toCharArray();
        for (char var:string){
            if (var=='x'|var=='w'){
                System.out.println("Первым встречается символ: " + var);
                return;
            }
        }
        System.out.println("Символа 'x' или 'w' в строке не обнаружено");
    }
}
