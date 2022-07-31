package collection.queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListQueueExample {
    public static void main(String[] args) {

        // Creating Queue using the PriorityQueue class
        Deque<Integer> numbers = new LinkedList<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("numbers: " + numbers);

        // addFirst
        numbers.addFirst(80);
        System.out.println("numbers - addFirst: " + numbers);

        // add last
        numbers.addLast(180);
        System.out.println("numbers - addLast: " + numbers);

        // get first
        int num = numbers.getFirst();
        System.out.println("getFirst: " + num);

        // get last
        num = numbers.getLast();
        System.out.println("getLast: " + num);

        // remove first
        numbers.removeFirst();
        System.out.println("numbers - removeFirst: " + numbers);

        // remove last
        numbers.removeLast();
        System.out.println("numbers - removeLast: " + numbers);

        // peek()
        num = numbers.peek();
        System.out.println("peek - returens head element: " + num);

        // poll()
        num = numbers.poll();
        System.out.println("poll - remove and returns head element: " + num);

        // offer()
        numbers.offer(30);
        numbers.offer(1880);
        numbers.offer(30);
        System.out.println("offer: " + numbers);

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
    }
}
