package old.TaskStrings;

import java.util.Scanner;

public class thirteenTask {
    public static void main(String[] args) {
        System.out.println("Дана строка. Заменить каждый четный символ или на 'a', если символ не равен 'a' или 'b', или на 'c' в противном случае.");
        Scanner scanner = new Scanner(System.in);
        char[] string = scanner.nextLine().toCharArray();
        for (int i=0;i<string.length;i++){
            if (i%2!=0){
                if (string[i]=='a'|string[i]=='b'){
                    string[i]='c';
                }else {
                    string[i]='a';
                }
            }
        }
        System.out.println(string);
    }
}
