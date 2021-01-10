package old.Get_Set_Constructor6;

public class Car {
    public int getEarRelease() {
        return earRelease;
    }

    public void setEarRelease(int earRelease) {
        this.earRelease = earRelease;
    }

    private int earRelease;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private String model;

    void info(){
        System.out.println("Этот автомобиль ");
    }

    int yearDefference(int yearNow){
        return yearNow - getEarRelease();
    }
}
