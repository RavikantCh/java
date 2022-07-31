package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> customers = new HashMap<>();
        customers.put(1, "John");
        customers.put(2, "Smith");
        customers.put(3, "Sally");

        System.out.println("*********** iterate using keySet()  **************");
        for (Integer key : customers.keySet()) {
            System.out.println("Key: " + key + " value: " + customers.get(key));
        }

        System.out.println("*********** iterate using entrySet() **************");
        for (Map.Entry<Integer, String> maps : customers.entrySet()) {
            System.out.println("Key: " + maps.getKey() + " value: " + maps.getValue());
        }

        System.out.println("*********** Using iterator - keySet  *************");
        Iterator<Integer> iterator = customers.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println("Key: " + key + " value: " + customers.get(key));
        }

        System.out.println("*********** Using iterator - entrySet *************");
        Iterator<Map.Entry<Integer, String>> iterator1 = customers.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Integer, String> maps1 = iterator1.next();
            System.out.println("Key: " + maps1.getKey() + " value: " + maps1.getValue());
        }

        System.out.println("*********** iterate using foreach in Java 8 *******");
        customers.forEach((k, v) -> {
            System.out.println("Key: " + k + " value: " + v);
        });

        System.out.println("*********** iterate using stream() in Java 8 *******");
        customers.entrySet().stream().forEach((e) -> {
            System.out.println("Key: " + e.getKey() + " value: " + e.getValue());
        });
    }
}
