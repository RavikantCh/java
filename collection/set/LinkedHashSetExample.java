package collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(70);
        numbers.add(10);
        numbers.add(410);

        System.out.println("Set: " + numbers);

        // Iterate using for each loop
        System.out.println("**************  Iterate using for each loop *************************");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Iterate using Iterator
        System.out.println("**************  Iterate using Iterator ******************************");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterate using lambda expression
        System.out.println("**************  Iterate using lambda expression**********************");
        numbers.forEach(System.out::println);

        // Iterate using streams()
        System.out.println("**************  Iterate using for stream *************************");
        numbers.stream().forEach(System.out::println);

        System.out.println("*********************************************************************");
        System.out.println("Size: " + numbers.size());
        System.out.println("*********************************************************************");
        System.out.println("isEmpty: " + numbers.isEmpty());
        System.out.println("*********************************************************************");
        System.out.println("contains: " + numbers.contains(70));
        System.out.println("*********************************************************************");
        // Make a new HashSet and copy all elements of
        // original HashSet using constructor
        Set<Integer> copyOfSet = new HashSet<>(numbers);
        Set<Integer> copyOfSet1 = new HashSet<>();
        System.out.println("Set: " + numbers);
        System.out.println("copyOfSet: " + copyOfSet);
        copyOfSet1.addAll(numbers);
        System.out.println("copyOfSet1: " + copyOfSet1);
        System.out.println("*********************************************************************");
        numbers.remove(0);
        System.out.println("Set after remove: " + numbers);
        System.out.println("*********************************************************************");
        numbers.remove(410);
        System.out.println("Set after remove: " + numbers);
        System.out.println("*********************************************************************");
        List<Integer> list = new ArrayList<>(copyOfSet);
        Collections.sort(list);
        System.out.println("After sorting - set converted to list: " + numbers);
        System.out.println("*********************************************************************");
        System.out.println("Max value in the set: " + Collections.max(copyOfSet));
        System.out.println("*********************************************************************");
        System.out.println("Min value in the set: " + Collections.min(copyOfSet));
        System.out.println("*********************************************************************");
        copyOfSet1.clear();
        System.out.println("copyOfSet1: " + copyOfSet1);
        System.out.println("*********************************************************************");
    }

}
