package old.Day8;

import javafx.beans.binding.StringBinding;

public class Test1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder number1 = new StringBuilder();
        for(int i=0;i<=20000;i++){
            number1.append(i).append(" ");
        }
        System.out.println(number1.toString());
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println();
        System.out.println(timeConsumedMillis);
    }
}
