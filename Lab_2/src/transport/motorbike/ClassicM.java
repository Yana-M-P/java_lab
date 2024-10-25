package transport.motorbike;

public class ClassicM extends Motorbike {

    public ClassicM(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void diagnostics() {
        System.out.println("Діагностика класичного мотоцикла");
    }

    @Override
    public void repair() {
        System.out.println("Ремонт класичного мотоцикла");
    }
}
