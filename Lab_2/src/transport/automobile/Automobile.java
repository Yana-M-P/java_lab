package transport.automobile;
import transport.Transport;

public class Automobile extends Transport {

      public Automobile(String brand, int speed) {
          super(brand, speed);
      }
      @Override
      public void diagnostics() {
          System.out.println("Діагностика автомобіля");
      }
      @Override
      public void repair() {
          System.out.println("Ремонт автомобіля");
      }
  }