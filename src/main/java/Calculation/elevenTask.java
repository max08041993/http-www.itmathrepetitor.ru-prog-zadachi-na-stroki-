package Calculation;

public class elevenTask {
    public static void main(String[] args) {
        System.out.println("11. Вычислите значение выражения |x−5|−sinx3+x2+2014−−−−−−−−√cos2x−3 при x=−2.34. Ответ: -1.76911 (проверено!)");
        double x = -2.34;
        System.out.println((Math.abs(x-5)-Math.sin(x))/3 + Math.sqrt(Math.pow(x,2)+2014)*Math.cos(2*x)-3);
    }
}
