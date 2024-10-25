package transport;

public abstract class Transport {
    private String brand; 
    private int speed;

    public Transport() {
    }

    public Transport(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public abstract void diagnostics();
    public abstract void repair();

    public void display() {
        System.out.println("Бренд: " + brand + ", Швидкість: " + speed + " км/год");
    }
}
