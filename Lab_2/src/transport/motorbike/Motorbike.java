package transport.motorbike;

import transport.Transport;

public class Motorbike extends Transport {

    public Motorbike(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void diagnostics() {
        System.out.println("Діагностика мотоцикла");
    }

    @Override
    public void repair() {
        System.out.println("Ремонт мотоцикла");
    }
}
