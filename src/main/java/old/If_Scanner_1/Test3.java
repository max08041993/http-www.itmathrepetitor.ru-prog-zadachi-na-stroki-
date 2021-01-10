package old.If_Scanner_1;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        if(x>=5){
            System.out.println((x*x-10)/(x+7));
        }else if(x>-3 && x<5){
            System.out.println((x+3)*(x*x-2));
        }else {
            System.out.println(420);
        }

    }
}
