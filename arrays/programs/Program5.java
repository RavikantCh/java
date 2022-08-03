package arrays.programs;

import java.util.Arrays;
import java.util.Collections;

public class Program5 {
    // Program to sort an array

    public static void main(String[] args) {
        Integer[] numbersArray = { 10, 55, 2, 48, 150 };

        System.out.print("Before sorting: ");
        Arrays.stream(numbersArray).forEach(s -> System.out.print(s + " "));
        System.out.println("\n===================================================================");

        Arrays.sort(numbersArray);
        System.out.print("After sorting: ");
        Arrays.stream(numbersArray).forEach(s -> System.out.print(s + " "));
        System.out.println("\n===================================================================");

        Arrays.sort(numbersArray, Collections.reverseOrder());
        System.out.print("After sorting - reverse order: ");
        Arrays.stream(numbersArray).forEach(s -> System.out.print(s + " "));
        System.out.println("\n===================================================================");

        Arrays.sort(numbersArray);
        Arrays.sort(numbersArray, (i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
        System.out.print("After sorting - reverse order: ");
        Arrays.stream(numbersArray).forEach(s -> System.out.print(s + " "));
        System.out.println("\n===================================================================");

        Arrays.parallelSort(numbersArray);
        // Print sorted Array
        System.out.print("Array sorted using parallelSort: ");
        Arrays.stream(numbersArray).forEach(num -> System.out.print(num + " "));
        System.out.println("\n===================================================================");
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] sortedArr = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue)
                .toArray();
        System.out.print("Array sorted using stream(): ");
        Arrays.stream(sortedArr).forEach(s -> System.out.print(s + " "));
        System.out.println("\n===================================================================");
    }
}
