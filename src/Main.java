public class Main
{
    public static void main(String[] args)
    {
        Car audi = new Car("red", 5, "A4",false);
        System.out.println(audi.getAutomaticGearBox());
        audi.setAutomaticGearBox(true);
        System.out.println(audi.getAutomaticGearBox());
    }
}
