package transport.motorbike;

public class SportM extends Motorbike {

    public SportM(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void diagnostics() {
        System.out.println("Діагностика спортивного мотоцикла");
    }

    @Override
    public void repair() {
        System.out.println("Ремонт спортивного мотоцикла");
    }
}
