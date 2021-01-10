package old.TaskStrings;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class twelveTask {
    public static void main(String[] args) {
        System.out.println("Дана строка. Разделить строку на фрагменты по три подряд идущих символа. В каждом фрагменте средний символ заменить на случайный символ, не совпадающий ни с одним из символов этого фрагмента. Показать фрагменты, упорядоченные по алфавиту.");
        Scanner scanner = new Scanner(System.in);
        Strings strings = new Strings();
        Random random = new Random();
        char[] var =scanner.nextLine().toCharArray();
        int count=var.length;
        for (int i = 0;i<count;i=i+3){
            if(i+2<count){
                char two = strings.numbers[random.nextInt(9)];
                boolean key=true;
                while (key){
                    if(two==var[i]|two==var[i+1]|two==var[i+2]){
                        two = strings.numbers[random.nextInt(9)];
                    }else{
                        key=false;
                    }
                }
                char[] aaa = new char[3];
                aaa[0]=var[i];
                aaa[1]=two;
                aaa[2]=var[i+2];
                Arrays.sort(aaa);
                String sorted = new String(aaa);
                System.out.println(sorted);
            }
        }

    }
}
