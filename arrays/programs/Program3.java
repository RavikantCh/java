package arrays.programs;

// Program to find Smallest Number in Array Java

public class Program3 {
    public static void main(String[] args) {
        int min = 0;

        int[] numbers = { 10, 55, 2, 48, 150 };
        min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Min number: " + min);
    }
}
