package old.TaskStrings;

import java.util.Scanner;

public class elevenTask {
    public static void main(String[] args) {
        System.out.println("Дана строка. Если ее длина больше 10, то оставить в строке только первые 6 символов, иначе дополнить строку символами 'o' до длины 12.");
        Scanner scanner = new Scanner(System.in);
        char[] string = scanner.nextLine().toCharArray();
        char[] string2 = new char[6];
        char[] string3 = new char[12];
        if (string.length>10){
                System.arraycopy(string, 0, string2, 0, 6);
            System.out.println(string2);
        }else {
            System.arraycopy(string, 0, string3, 0, string.length);
            for (int i=string.length;i<string3.length;i++) {
                string3[i]='o';
            }
            System.out.println(string3);
        }
    }
}
