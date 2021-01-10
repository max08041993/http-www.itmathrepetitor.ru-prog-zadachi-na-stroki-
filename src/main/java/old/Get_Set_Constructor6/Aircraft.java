package old.Get_Set_Constructor6;

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
}
