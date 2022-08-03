package arrays.programs;

public class Program1 {
    // Program to add all the elements of array and display the sum

    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = { 10, 20, 30, 40, 50 };
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of all elements: " + sum);
    }
}
