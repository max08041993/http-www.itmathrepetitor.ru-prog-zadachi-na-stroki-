package old.Get_Set_Constructor_5;

public class TaskN {
    public static void main(String[] args) {
        Car car = new Car();
        car.setEarRelease(2020);
        car.setColor("Желтый");
        car.setModel("BMW");
        System.out.println(car.getEarRelease() + " " + car.getColor() + " " + car.getModel());
    }
}
