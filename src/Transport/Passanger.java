package Transport;

public class Passanger extends Transport implements Competing {


    public Passanger(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }


    @Override
    public int pitStop(int numberOfLapse) {
        while (numberOfLapse < 30) {
            System.out.println("Продолжай движение");
        }
        if (numberOfLapse % 10 == 0) {
            System.out.println("Уходи на питстоп");
        }
        return 0;
    }
}