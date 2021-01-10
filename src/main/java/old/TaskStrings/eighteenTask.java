package old.TaskStrings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class eighteenTask {
    public static void main(String[] args) {
        System.out.println("18. Удалите в строке все 'abc', за которыми следует цифра.");
        Scanner scanner= new Scanner(System.in);
        String string = scanner.nextLine();
        boolean key=true;
        while (key){
            if (string.contains("abc")){
                string=string.replaceAll("abc","");
                key=true;
                System.out.println("В условии");
            }else{
                key=false;
            }
        }
        System.out.println(string);
    }
}
