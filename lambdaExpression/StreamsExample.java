package lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {
    static List<Integer> newList;
    static List<String> newList1;

    public static void main(String[] args) {

        // There are broadly 3 types of operations that are carried over streams:
        // Intermediate operations, Terminal operations, Short-circuit operations

        // Intermediate Operatoions: filter(), map(), flatMap(), distinct(), sorted(),
        // peek(), limit(), skip()

        // Terminal Operations: forEach(), forEachOrdered(), toArray(), reduce(),
        // collect(), min(), max(), count(),

        // Short-cut Operations: anyMatch(), allMatch(), noneMatch(), findFirst(),
        // findAny()

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 5, 30, 15, 20, 25, 25));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<String> list1 = new ArrayList<>(
                Arrays.asList("Pavan", "RaviTeja", "Chiranjeevi", "Venketesh", "Nagarjuna"));

        // Filter even numbers in the list
        newList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("Filter even numbers in the list: " + newList);

        // double the value of each element value in the list
        newList = list.stream().map(i -> i * 2).collect(Collectors.toList());
        System.out.println("Filter even numbers in the list: " + newList);

        // Filter elements whose length is greater than 9
        newList1 = list1.stream().filter(s -> s.length() >= 9).collect(Collectors.toList());
        System.out.println("Filter elements whose length is greater than 9: " + newList1);

        // Collect All th elements in the list in upper case
        newList1 = list1.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println("Collect All th elements in the list in upper case: " + newList1);

        // Filter elements whose length is greater than 9 and count it
        long count = list1.stream().filter(s -> s.length() >= 9).count();
        System.out.println("elements count whose length is greater than 9: " + count);

        // Sort the elements in the list in ascending order
        newList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Elements sorted in ascending order: " + newList);

        // Sort the elements in the list in desscending order
        newList = list.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println("Elements sorted in desscending order: " + newList);

        newList = list.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("Elements sorted in desscending order: " + newList);

        // flatMap(): merge multiple collections/arrays into one
        List<List<Integer>> listOfLists = Arrays.asList(list, list2);
        List<Integer> listOfAllIntegers = listOfLists.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
        System.out.println("flatMap() : " + listOfAllIntegers);

        // distinct(): returns new stream consisting of the distinct elements from the
        // given stream
        List<Integer> distinctElements = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("distinct(): " + distinctElements);

        // return minimum value
        int min = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("minimum value in the list: " + min);

        // return max value
        int max = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("minimum value in the list: " + max);

        // forEach
        System.out.println("Print each element in the list using foreach");
        list.stream().forEach(System.out::println);

        // copy elements present inside the stream to array
        Integer[] arr = list.stream().toArray(Integer[]::new);
        System.out.println("copy elements present inside the stream to array:");
        for (Integer value : arr) {
            System.out.println(value);
        }

        // forEachOrdered():
        System.out.println("forEachOrdered():");
        list.stream()
                .forEachOrdered(System.out::println);

        System.out.println("sorted() - forEachOrdered()");
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEachOrdered(System.out::println);

        // limit(N): returns first N elements in the encounter order of the Stream.
        Stream<Integer> evenNumInfiniteStream = Stream.iterate(0, n -> n + 2);
        List<Integer> newList = evenNumInfiniteStream.limit(5)
                .collect(Collectors.toList());
        System.out.println("limit(): " + newList);

        // skip(N) discards the first N elements of the Stream.
        List<Integer> list7 = list.stream().skip(4)
                .collect(Collectors.toList());
        System.out.println("skip(): " + list7); // [7, 8, 9, 10]

        // anyMatch: Checking if Stream contains a Specific Element
        boolean match = list1.stream().anyMatch(s -> s.startsWith("V"));
        System.out.println("anyMatch: " + match);
        // Note: The shorter version list.contains() also does the same thing and can be
        // used instead

        // allMatch: to run a check on all stream elements.
        match = list1.stream().allMatch(s -> s.startsWith("V"));
        System.out.println("allMatch: " + match);

        // noneMatch: to run a check on all stream elements.
        match = list1.stream().noneMatch(s -> s.startsWith("Z"));
        System.out.println("noneMatch: " + match);

        // findFirst(): returns Optional describing the first element of this stream
        System.out.println("findFirst(): ");
        list1.stream().findFirst().ifPresent(System.out::println);

        // findAny(): returns an Optional describing the any element of this stream
        System.out.println("findAny(): ");
        list1.stream().findAny().ifPresent(System.out::println);

        // Stream.of
        Stream<Integer> values = Stream.of(9, 99, 999, 9999, 99999);
        System.out.println("Stream.of");
        values.forEach(System.out::println);

        // Stream.of array
        Integer[] values1 = { 9, 99, 999, 9999, 99999 };
        Stream<Integer> values2 = Stream.of(values1);
        System.out.println("Stream.of array");
        values2.forEach(System.out::println);

        Map<String, Integer> stringToLength = list1.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println("toMap(): " + stringToLength);
        // The Function.identity() used here denotes that the same object is used as a key.


    }
}
