package collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExampleBasicMethods {
    public static void main(String[] args) {
        Map<Integer, String> customers = new HashMap<>();
        customers.put(1, "John");
        customers.put(2, "Smith");
        customers.put(3, "Sally");

       boolean booleanValue;
       System.out.println(customers);
       System.out.println("**********************************************************");
       booleanValue = customers.containsKey(1);
       System.out.println("containsKey: " + booleanValue);
       System.out.println("**********************************************************");
       booleanValue = customers.containsValue("John");
       System.out.println("containsValue: " + booleanValue);
       System.out.println("**********************************************************");
       System.out.println("size: " + customers.size());
       System.out.println("**********************************************************");
       booleanValue = customers.isEmpty();
       System.out.println("isEmpty: " + booleanValue);
       System.out.println("**********************************************************");
       customers.remove(2);
       System.out.println("remove: " + customers);
       System.out.println("**********************************************************");
       customers.replace(1, "Veronica");
       System.out.println("replace: " + customers);
       System.out.println("**********************************************************");
       Map<Integer, String> customers1 = new HashMap<>();
       customers1.putAll(customers);
       System.out.println("putAll: " + customers1);
       System.out.println("**********************************************************");
       System.out.println("get: " + customers.get(1));
       System.out.println("**********************************************************");
       booleanValue = customers.equals(customers1);
       System.out.println("equals: " + booleanValue);
       System.out.println("**********************************************************");
       customers.replaceAll((key, value) -> value.toUpperCase());
       System.out.println("replaceAll: " + customers);
       System.out.println("**********************************************************");
       String value1 = customers.getOrDefault(2, "Key not found");
       System.out.println("getOrDefault:  " + value1);
       System.out.println("**********************************************************");
       customers.clear();
       System.out.println("clear: " + customers);
       System.out.println("**********************************************************");
    }
}
