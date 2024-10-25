package transport.automobile;

public class Car extends Automobile {

    public Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void diagnostics() {
        System.out.println("Діагностика легкового автомобіля");
    }

    @Override
    public void repair() {
        System.out.println("Ремонт легкового автомобіля");
    }
}