package transport.automobile;

public class SUV extends Automobile {

    public SUV(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void diagnostics() {
        System.out.println("Діагностика позашляховика");
    }

    @Override
    public void repair() {
        System.out.println("Ремонт позашляховика");
    }
}