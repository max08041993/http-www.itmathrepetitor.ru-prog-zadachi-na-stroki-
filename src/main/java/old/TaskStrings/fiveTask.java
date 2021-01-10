package old.TaskStrings;

import java.util.Scanner;

public class fiveTask {
    public static void main(String[] args) {
        System.out.println("Дана строка. Показать номера символов, совпадающих с последним символом строки.");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char [] stringToArray = string.toCharArray();
        int number=stringToArray.length - 1;
        char var = stringToArray[number];
        for (int i=0;i<stringToArray.length;i++){
            if (var==stringToArray[i]){
                System.out.println(i);
            }
        }
//        int count = 0;
//        for (char value:stringToArray){
//            if (value==stringToArray[number]){
//                System.out.println(count);
//            }
//            count++;
//        }
    }
}
