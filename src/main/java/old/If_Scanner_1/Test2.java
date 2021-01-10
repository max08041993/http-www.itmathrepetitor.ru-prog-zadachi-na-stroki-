package old.If_Scanner_1;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i=a+1;
        while (i<b){
            i++;
            if (i%5 == 0 && i%10!=0){
                System.out.print(i + " ");
            }
        }
    }
}
