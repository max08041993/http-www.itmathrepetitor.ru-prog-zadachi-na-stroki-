package old.Massive_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] mass = new int[n];
        Random random = new Random();
        for (int i=0;i<mass.length;i++)
            mass[i]=random.nextInt(10);
        System.out.println(Arrays.toString(mass));
        System.out.println("Длинна массива " + mass.length);
        int more8 = 0;
        for (int j : mass) {
            if (j > 8)
                more8++;
        }
        System.out.println("Количество чисел больше 8: " + more8);
        int equal1 = 0;
        for (int j : mass) {
            if (j == 1)
                equal1++;
        }
        System.out.println("Количество чисел равных 1: " + equal1);
        int EvenNumbers = 0;
        int notEvenNumbers = 0;
        for (int j : mass) {
            if (j%2==0) {
                EvenNumbers++;
            }else notEvenNumbers++;
        }
        System.out.println("Количество четных чисел: " + EvenNumbers);
        System.out.println("Количество не четных чисел: " + notEvenNumbers);
        int sum=0;
        for (int j =0; j<mass.length;j++){
            sum += mass[j];
        }
        System.out.println("Сумма элементов массива: " + sum);


    }
}
