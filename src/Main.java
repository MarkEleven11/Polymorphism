import Transport.Bus;
import Transport.Cargo;
import Transport.Competing;
import Transport.Passanger;

public class Main {
    public static void main(String[] args) {

        Bus scania = new Bus("Scania", "Touring", 13.0);
        Bus maz = new Bus("MAZ", "206", 4.2);
        Bus mercedes = new Bus("Mercedes", "Sprinter", 3.0);

        Passanger bmw = new Passanger("BMW", "M5", 4.3 );
        Passanger skoda = new Passanger("Skoda", "Superb", 3.6);
        Passanger toyota = new Passanger("Toyota", "Tundra", 7.6);

        Cargo kamaz = new Cargo("KamAZ", "54907", 13.0);
        Cargo hyndai = new Cargo("Hyndai", "Mighty", 3.9);
        Cargo freighliner = new Cargo("Freighliner", "Cascadia", 12.9);

        System.out.println(scania);
        System.out.println(maz);
        System.out.println(mercedes);
        System.out.println();
        System.out.println(bmw);
        System.out.println(skoda);
        System.out.println(toyota);
        System.out.println();
        System.out.println(kamaz);
        System.out.println(hyndai);
        System.out.println(freighliner);



    }
}