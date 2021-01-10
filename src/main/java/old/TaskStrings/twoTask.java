package old.TaskStrings;

import java.util.Scanner;

public class twoTask {
    public static void main(String[] args) {
        System.out.println("Дана строка. Вывести первый, последний и средний (если он есть)) символы.");
        System.out.println("Введите строку для вывода первого, последнего и среднего символа, если таковые имеются");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] strToArray = str.toCharArray();
        if(str.length()!=0){
            System.out.println("Первый символ: "+strToArray[0]);
            System.out.println("Последний символ: "+strToArray[str.length()-1]);
            int var = str.length()%2;
            if (var!=0){
                System.out.println("Средний символ: "+ strToArray[str.length()/2]);
            }
        }else System.out.println("Введенная строка не имеет символов");
    }
}
