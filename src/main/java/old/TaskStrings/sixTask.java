package old.TaskStrings;

import java.util.Scanner;

public class sixTask {
    public static void main(String[] args) {
        System.out.println("Дана строка. Показать третий, шестой, девятый и так далее символы.");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char[] stringToArrey=string.toCharArray();
        int count=stringToArrey.length;
        System.out.println(count);
        for (char var:stringToArrey){
            count--;
            if ((stringToArrey.length-count)%3==0){
                System.out.println(var);
            }
        }
    }
}
