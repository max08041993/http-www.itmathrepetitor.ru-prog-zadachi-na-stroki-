package old.TaskStrings;

import java.util.Arrays;
import java.util.Scanner;

public class tenTask {

    public static void main(String[] args) {
        System.out.println("Дана строка. Если она начинается на 'abc', то заменить их на 'www', иначе добавить в конец строки 'zzz'.");
        Scanner scanner = new Scanner(System.in);
        char[] string = scanner.nextLine().toCharArray();
        if (string[0]=='a' & string[1]=='b' & string[2]=='c'){
            string[0]='w';
            string[1]='w';
            string[2]='w';
            System.out.println(string);
        }else {
            String var = new String(string);
            System.out.println(var + "www");
        }
    }

}
