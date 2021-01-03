package Strings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class twenty_fourTask {
    public static void main(String[] args) throws IOException {
        System.out.println("24. Дан текст. Найти слова, состоящие из цифр, и сумму чисел, которые образуют эти слова.");
        String str = Files.lines(Paths.get("text.txt")).reduce("",String::concat);
        System.out.println(str);
        String[] strings = str.split(" ");
        for (String s:strings) {
            int value=0;
            char[] var=s.toCharArray();
            for (char a:var){
                if (Character.isDigit(a)){
                    value++;
                }
            }
            if (s.length()==value){
                System.out.println("Слово: "+s+" состоит только из чисел.");
            }
        }
        int sum=0;
        char[] st=str.toCharArray();
        for (char num:st){
            if(Character.isDigit(num)){
                sum=sum+Character.getNumericValue(num);
            }
        }
        System.out.println("Сумма чисел в строке: " + sum);
    }
}
