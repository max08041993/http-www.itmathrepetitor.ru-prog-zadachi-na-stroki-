import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class twentythreeTask {
    public static void main(String[] args) throws IOException {
        System.out.println("23. Дан текст. Найти сумму имеющихся в нем цифр");
        char[] str = Files.lines(Paths.get("text.txt")).reduce("",String::concat).toCharArray();
        int sum=0;
        System.out.println(str);
        for (char num:str){
            if(Character.isDigit(num)){
                sum=sum+Character.getNumericValue(num);
                System.out.println(sum);
            }
        }
        System.out.println("Сумма чисел в строке: " + sum);
    }
}
