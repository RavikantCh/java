package collection.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {

        // Declare an LinkedList

        List<String> fruitsList = new LinkedList<>();
        fruitsList.add("Kiwi");
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Grapes");

        fruitsList.forEach(System.out::println);

        // Iterate LinkedList
        System.out.println("************* Iterate LinkedList - for loop **************");
        for (int i = 0; i < fruitsList.size(); i++) {
            System.out.println(fruitsList.get(i));
        }

        System.out.println("************* Iterate LinkedList - for each loop***********");
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }

        System.out.println("************* Iterate LinkedList - Iterator **************");
        Iterator<String> iterator = fruitsList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("************* Iterate LinkedList - while loop ************");
        int count = 0;
        while (count < fruitsList.size()) {
            System.out.println(fruitsList.get(count));
            count++;
        }

        System.out.println("************* Iterate LinkedList - Lambda expression******");
        fruitsList.forEach(System.out::println);

        System.out.println("************* Iterate LinkedList - Streams ***************");
        fruitsList.stream().forEach(System.out::println);

        // Basic functions - update, add, clear, isEmpty, size, remove
        System.out.println("**********************************************************");
        fruitsList.add(1, "pineapple");
        System.out.println("After add element at specific location: " + fruitsList);
        System.out.println("**********************************************************");
        fruitsList.set(1, "updatePineapple");
        System.out.println("After update element: " + fruitsList);
        System.out.println("**********************************************************");
        fruitsList.remove("updatePineapple");
        System.out.println("After remove element: " + fruitsList);
        System.out.println("**********************************************************");
        fruitsList.remove(0);
        System.out.println("After remove element at specific location: " + fruitsList);
        System.out.println("**********************************************************");
        System.out.println("Is list Empty: " + fruitsList.isEmpty());
        System.out.println("**********************************************************");
        System.out.println("list size: " + fruitsList.size());
        System.out.println("**********************************************************");
        System.out.println("does list contains a specific element: " + fruitsList.contains("Grapes"));
        System.out.println("**********************************************************");
        System.out.println("get element from a specific location: " + fruitsList.get(2));
        System.out.println("**********************************************************");
        fruitsList.clear();
        System.out.println("List after clear: " + fruitsList);
        System.out.println("**********************************************************");

        // sort ascending order, descending order - primitive objects

        //

    }
}
