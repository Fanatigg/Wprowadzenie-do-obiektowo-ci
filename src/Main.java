import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Car audi = new Car("A4", "red", 5, false);
        System.out.println(audi.getAutomaticGearBox());
        audi.setAutomaticGearBox(true);
        System.out.println(audi.getAutomaticGearBox());
        System.out.println(audi.getColour());
        audi.setColour("blue");
        System.out.println(audi.getColour());
        audi.setDoorAmount(17);
        System.out.println(audi.getDoorAmount());

        Calculator liczydło = new Calculator();
        liczydło.add(1 , 2);
        System.out.println(liczydło.add(1,2));
        */
        Calculator liczydlo = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać pierwszą liczbę");
        int firstVariable = scanner.nextInt();
        System.out.println("Proszę podać drugą liczbę");
        int secondVariable = scanner.nextInt();
        System.out.println("Twój wynik to " + liczydlo.add(firstVariable, secondVariable));

    }
}
