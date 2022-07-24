public class Car
{
    private  String brand;
    private String colour;
    private int doorAmount;
    private boolean automaticGearBox;

    public Car(String brand, String colour, int doorAmount, boolean automaticGearBox) {
        this.brand = brand;
        this.colour = colour;
        this.doorAmount = doorAmount;
        this.automaticGearBox = automaticGearBox;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDoorAmount() {
        return doorAmount;
    }

    public void setDoorAmount(int doorAmount) {
        this.doorAmount = doorAmount;
    }

    public boolean getAutomaticGearBox() {
        return automaticGearBox;
    }

    public void setAutomaticGearBox(boolean automaticGearBox) {
        this.automaticGearBox = automaticGearBox;
    }
}
