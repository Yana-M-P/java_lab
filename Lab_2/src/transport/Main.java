package transport;

import transport.automobile.Car;
import transport.automobile.SUV;
import transport.motorbike.ClassicM;
import transport.motorbike.SportM;


public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 180);
        SUV suv = new SUV("Jeep", 160);
        ClassicM classicM = new ClassicM("Harley-Davidson", 120);
        SportM sportM = new SportM("Yamaha", 200);

          interaction(car);
          interaction(suv);
          interaction(classicM);
          interaction(sportM);
    }

    public static void interaction(Transport transport) {
        System.out.println("Бренд: " + transport.getBrand());
        transport.diagnostics();
        transport.repair();
        System.out.println();
    }
}