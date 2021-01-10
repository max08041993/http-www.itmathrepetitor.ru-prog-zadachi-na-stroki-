package old.Day7;

public class Aircraft {
    public Aircraft(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    private String producer;
    private int year;
    private double length;
    private double weight;

    public double getFuel() {
        return fuel;
    }

    private double fuel = 0;

    void info(){
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длинна: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    void fillUp(double var){
        fuel+=var;
    }

    public static void compareAirplanes(int long1, int long2){
        Aircraft aircraft = new Aircraft("Российские авиалиннии", 2015,long1,50);
        Aircraft aircraft1 = new Aircraft("Российские авиалиннии", 2015,long2,50);
        if (long1>long2){
            aircraft.info();
            aircraft1.info();
            System.out.println("Первый Самолет длиннее на " + (long1-long2) + " метров");
        }else if (long1<long2){
            aircraft.info();
            aircraft1.info();
            System.out.println("Второй Самолет длиннее на " + (long2-long1) + " метров");
        }else {
            aircraft.info();
            aircraft1.info();
            System.out.println("Самолеты равны в динне");
        }
    }
}
