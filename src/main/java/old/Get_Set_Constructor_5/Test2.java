package old.Get_Set_Constructor_5;

public class Test2 {
    public static void main(String[] args) {
        Moto moto = new Moto(2020,"Белый","BMW");
        System.out.println(moto.getEarRelease() + "\n" +
                moto.getColor() + "\n" +
                moto.getModel());
    }
}
