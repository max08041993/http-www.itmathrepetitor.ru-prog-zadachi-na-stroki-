package old.TaskStrings;

import java.util.Scanner;

public class nineTask {
    public static void main(String[] args) {
        System.out.println("Даны две строки. Вывести большую по длине строку столько раз, на сколько символов отличаются строки.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строчку:");
        char[] string1 = scanner.nextLine().toCharArray();
        System.out.println("Введите вторую строчку:");
        char[] string2 = scanner.nextLine().toCharArray();
        int var1 = string1.length;
        int var2 = string2.length;
        int var=0;
        if (var1>var2){
            var=var1-var2;
            for (int i=0;i<var;i++){
                System.out.println(string1);
            }
        }else {
            var=var2-var1;
            for (int i=0;i<var;i++){
                System.out.println(string2);
            }
        }
    }
}
