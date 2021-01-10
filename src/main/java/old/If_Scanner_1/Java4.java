package old.If_Scanner_1;

import java.util.Scanner;

public class Java4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i=a;i<b;i++){
           if (i%5==0 && i%10!=0){
               System.out.println(i);
           }
        }
    }
}
