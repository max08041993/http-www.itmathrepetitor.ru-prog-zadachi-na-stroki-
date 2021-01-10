package old.TaskStrings;

import java.util.Arrays;
import java.util.Random;

public class fourTask {

    public static void main(String[] args) {
        System.out.println("Сформировать строку из 10 символов. На четных позициях должны находится четные цифры, на нечетных позициях - буквы.");
        Strings strings = new Strings();
        Random random = new Random();
        char[] var = new char[10];
        for (int i = 0;i<10;i++){
            boolean key=true;
            if(i%2==0){
                var[i]= strings.alphabet[random.nextInt(25)];
            }else {
                while(key){
                    int zar = Character.getNumericValue(strings.numbers[random.nextInt(9)]);
                    if(zar %2!=0 & zar!=9 ) {
                        System.out.println(zar);
                        var[i] = strings.numbers[zar];
                        key = false;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(var));
    }
}
