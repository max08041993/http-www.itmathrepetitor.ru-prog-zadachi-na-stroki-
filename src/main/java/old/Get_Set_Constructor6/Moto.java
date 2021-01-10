package old.Get_Set_Constructor6;

public class Moto {
    public int getEarRelease() {
        return earRelease;
    }

    public Moto(int earRelease, String color, String model) {
        this.earRelease = earRelease;
        this.color = color;
        this.model = model;
    }

    private int earRelease;

    public String getColor() {
        return color;
    }

    private String color;

    public String getModel() {
        return model;
    }

    private String model;

    void info(){
        System.out.println("Этот мотоцикл ");
    }

    int yearDefference(int yearNow){
        return yearNow - getEarRelease();
    }
}
