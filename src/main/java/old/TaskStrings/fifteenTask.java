package old.TaskStrings;

import java.util.Scanner;

public class fifteenTask {
    public static void main(String[] args) {
        System.out.println("Дана строка. Определить, содержит ли строка только символы 'a', 'b', 'c' или нет.");
        Scanner scanner=new Scanner(System.in);
        char[] string=scanner.nextLine().toCharArray();
        boolean key=false;
        int var=0;
        for (char c:string){
            if (c=='a'|c=='b'|c=='c'){
                var++;
            }
        }if (var==string.length){
            System.out.println("Строка содержит только символы 'a', 'b', 'c'");
        }else
            System.out.println("Строка содержит отличные символы от 'a', 'b', 'c'");
    }
}
