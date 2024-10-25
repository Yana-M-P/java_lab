package transport;

public class Truck extends Transport {

    public Truck(String brand, int speed) {
        super(brand, speed);
    }
    @Override
    public void diagnostics() {
        System.out.println("Діагностика вантажівки");
    }
    @Override
    public void repair() {
        System.out.println("Ремонт вінтажівки");
    }
}