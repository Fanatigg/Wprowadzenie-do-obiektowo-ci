public class Car
{
    private  String brand;
    private String colour;
    private int doorAmount;
    private boolean automaticGearBox;

    public Car(String colour, int doorAmount, String brand, boolean automaticGearBox)
    {
        this.colour = colour;
        this.doorAmount = doorAmount;
        this.brand = brand;
        this.automaticGearBox = automaticGearBox;
    }

    public void setAutomaticGearBox(boolean automaticGearBox)
    {
        this.automaticGearBox = automaticGearBox;
    }
    public boolean getAutomaticGearBox()
    {
        return automaticGearBox;
    }
}
