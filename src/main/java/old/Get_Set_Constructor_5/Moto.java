package old.Get_Set_Constructor_5;

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
}
