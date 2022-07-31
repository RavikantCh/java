package collection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;



public class PriorityQueueExamples {
    public static void main(String[] args) {

        // Creating Queue using the PriorityQueue class
        Queue<Integer> numbers = new PriorityQueue<>();

        // offer elements to the Queue
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);

        // Access elements of the Queue
        int number = numbers.peek();
        System.out.println("peek: " + number);

        // Remove elements from the Queue
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);
        System.out.println("Updated Queue: " + numbers);

        // Using the iterator() method
        System.out.println("***** Iterate Using the iterator() method *****");
        Iterator<Integer> iterate = numbers.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }

        System.out.println("***** Iterate Using the forEach()  *****");
        numbers.forEach(System.out::println);

        System.out.println("***** Iterate Using the stream()  *****");
        numbers.stream().forEach(System.out::println);

        System.out.println("***********************************************");
        int size = numbers.size();
        System.out.println("size: " + size);
        System.out.println("***********************************************");
        boolean isContain = numbers.contains(2);
        System.out.println("contains: " + isContain);
        System.out.println("***********************************************");
        
        System.out.println("***********************************************");
        System.out.println("***********************************************");
    }
}
