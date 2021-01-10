package old.TaskStrings;

import java.util.Arrays;
import java.util.Scanner;

public class seventeenTask {
    public static void main(String[] args) {
        System.out.println("17. Удалите в строке все буквы 'x'. за которыми следует 'abc'.");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(string);
        boolean key=true;
        while (key){
            if (string.contains("xabc")){
                string=string.replaceAll("xabc", "abc");
                System.out.println(string);
                key=true;
            }else key=false;
        }
        System.out.println(string);
    }
}
