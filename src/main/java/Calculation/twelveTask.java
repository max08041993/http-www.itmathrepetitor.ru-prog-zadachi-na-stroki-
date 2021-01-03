package Calculation;

public class twelveTask {
    public static void main(String[] args) {
        System.out.println("12. Вычислите значение выражения ex−2+|sin(x)|−x4⋅cos1x при x=3.6 Ответ: -156.1276");
        double x=3.6;
        double result = Math.pow(Math.E,x-2)+Math.abs(Math.sin(x))-Math.pow(x,4)*Math.cos(1/x);
        System.out.println(result);
    }
}
