import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.math.BigDecimal;

public class NumberStorage {

    private Map<Class<?>, List<Number>> numberMap = new HashMap<>();

    public NumberStorage() {
        numberMap.put(Integer.class, new ArrayList<>());
        numberMap.put(Double.class, new ArrayList<>());
        numberMap.put(Float.class, new ArrayList<>());
        numberMap.put(Long.class, new ArrayList<>());
        numberMap.put(Short.class, new ArrayList<>());
        numberMap.put(Byte.class, new ArrayList<>());
    }

    public void addNumber(Number num) {
        Class<?> clazz = num.getClass();

        numberMap.get(clazz).add(num);
    }

    public void displayAsIntegers() {
        System.out.println("Числа у форматі цілих чисел:");
        for (List<Number> list : numberMap.values()) {
            for (Number num : list) {
                System.out.print(num.intValue() + " ");
            }
        }
        System.out.println();
    }

    public void displayAsFloat() {
        System.out.println("\nЧисла у форматі дробових чисел з двома знаками після коми:");
        for (List<Number> list : numberMap.values()) {
            for (Number num : list) {
                System.out.printf("%.2f ", num.doubleValue());
            }
        }
    }

    public void displayAsBigDecimal() {
        System.out.println("\n\nЧисла у форматі BigDecimal:");
        for (List<Number> list : numberMap.values()) {
            for (Number num : list) {
                BigDecimal bigDecimalValue = new BigDecimal(String.valueOf(num));
                System.out.printf("%s  ", bigDecimalValue);
            }
        }
    }

    public static void main(String[] args) {
        NumberStorage storage = new NumberStorage();

        storage.addNumber(10);
        storage.addNumber(10.5);
        storage.addNumber(15.75f);
        storage.addNumber(100L);
        storage.addNumber((short) 5);
        storage.addNumber((byte) 2);
        storage.addNumber(42);
        storage.addNumber(3.14);
        storage.addNumber(2.71828f);
        storage.addNumber(123456789L);
        storage.addNumber((short) 32767);
        storage.addNumber((byte) 127);
        storage.addNumber(-10);
        storage.addNumber(-3.14159);
        storage.addNumber(-0.1f);
        storage.addNumber(-1000L);
        storage.addNumber((short) -20);
        storage.addNumber((byte) -5);

        storage.displayAsIntegers();
        storage.displayAsFloat();
        storage.displayAsBigDecimal();
    }
}
