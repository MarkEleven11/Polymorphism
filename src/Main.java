import Drivers.Driver;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import Transport.*;

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
        System.out.println();

        hyndai.pitStop(30);
        freighliner.bestTime(45.15);
        kamaz.maxSpeed(132);
        System.out.println();
        bmw.movement();
        bmw.stop();
        System.out.println();

        DriverB gosling = new DriverB("Rayan 'Drive' Gosling", true, 15, "");
        DriverC hardy = new DriverC("Tom 'MadMax' Hardy", true, 18, "");
        DriverD reeves = new DriverD("Keanu 'Speed' Reeves", true, 21, "");


        System.out.println(gosling);
        System.out.println(hardy);
        System.out.println(reeves);
        System.out.println();

        gosling.refuel();
        hardy.movement();
        reeves.stop();
        System.out.println();

        Driver<> tom = new Driver<>("Tom Hardy", true,18, freighliner);
        Driver<Bus> keanu = new Driver<>("Keanu Reeves", true,21, mercedes);
        Driver<Passanger> rayan = new Driver<>("Rayan Gosling", true, 15, bmw);

        rayan.toRace();
        keanu.toRace();
        tom.toRace();



    }
}