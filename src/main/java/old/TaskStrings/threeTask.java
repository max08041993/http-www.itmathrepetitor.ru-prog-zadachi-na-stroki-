package old.TaskStrings;

import java.util.Scanner;

public class threeTask {
    public static void main(String[] args) {
        System.out.println("Дана строка. Вывести первые три символа и последний три символа, если длина строки больше 5. Иначе вывести первый символ столько раз, какова длина строки.");
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (string.length()==0){
            System.out.println("Вы не ввели строку, попробуйте в другой раз");
            return;
        }
        char [] stringToArray = string.toCharArray();
        if (string.length()>5){
            System.out.println("Первые три символа: "+stringToArray[0] + ", " + stringToArray[1] + ", " + stringToArray[2]);
            System.out.println("Последние три символа: "+stringToArray[string.length()-3] + ", " + stringToArray[string.length()-2] + ", " + stringToArray[string.length()-1]);
        }else {
            for (int i=1;i<=string.length();i++){
                System.out.println("Вывожу первый символ столько раз, какова длинна строки: " + stringToArray[0]);
            }
        }

    }
}
