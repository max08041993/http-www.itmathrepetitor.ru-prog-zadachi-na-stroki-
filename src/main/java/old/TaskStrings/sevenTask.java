package old.TaskStrings;

import java.util.Scanner;

public class sevenTask {
    public static void main(String[] args) {
        System.out.println("Дана строка. Определите общее количество символов '+' и '-' в ней. А так же сколько таких символов, после которых следует цифра ноль.");
        Scanner scanner = new Scanner(System.in);
        char[] string = scanner.nextLine().toCharArray();
        int count=0;
        int count2=0;
//        for (char var:string){
//            if (var == '-'| var == '+'){
//                count++;
//            }
//        }
        for (int i=0;i<string.length;i++){
            if (string[i]=='-' | string[i]=='+'){
                count++;
            }
            if (string[i]=='0'){
                if (string[i-1]=='+'| string[i-1]=='-'){
                    count2++;
                }
            }
        }
        System.out.println("Общее количество символов '-' и '+' в строке равно: " + count);
        System.out.println("Колличество символов '+' и '-', после которых следует 0 составляет: " + count2);
    }
}
