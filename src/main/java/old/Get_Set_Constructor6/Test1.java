package old.Get_Set_Constructor6;

public class Test1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setEarRelease(2000);
        car.info();
        System.out.println(car.yearDefference(2020));
        System.out.println();
        Moto moto = new Moto(1985,"Белый","Минск");
        moto.info();
        System.out.println(moto.yearDefference(2020));
    }
}
