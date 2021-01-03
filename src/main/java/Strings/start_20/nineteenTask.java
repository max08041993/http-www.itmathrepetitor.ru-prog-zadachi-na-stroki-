package Strings.start_20;

import java.util.Scanner;

public class nineteenTask {
    public static void main(String[] args) {
        System.out.println("19. Найдите количество вхождения 'aba' в строку.");
        Scanner scanner = new Scanner(System.in);
        char[] strings = scanner.nextLine().toCharArray();
        int count=0;
        for (int i=0;i<strings.length-2;i++){
            if (strings[i]=='a'&strings[i+1]=='b'&strings[i+2]=='c')
                count++;
        }
        System.out.println("Количество вхождений 'abc' в строке состовляет: "+count);
    }
}
