package old.Get_Set_Constructor6;

public class Test2 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("Супер компания", 2010, 50 , 20);
        aircraft.setYear(2015);
        aircraft.setLength(60);
        aircraft.fillUp(49);
        aircraft.fillUp(85);
        aircraft.info();
    }
}
