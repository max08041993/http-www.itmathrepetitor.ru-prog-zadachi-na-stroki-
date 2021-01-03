package Calculation;

public class tenTask {
    public static void main(String[] args) {
        System.out.println("10. Вычислите значение выражения (x+1)2+3(x+1) при а) x=1.7; б) x=3. Ответ: а) 15.39 б) 28");
        double x = 1.7;
        System.out.println(Math.pow((x+1),2)+3*(x+1));
        x=3;
        System.out.println(Math.pow((x+1),2)+3*(x+1));
    }
}
