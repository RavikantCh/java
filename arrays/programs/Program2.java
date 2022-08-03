package arrays.programs;

public class Program2 {
    // Program to Find Average in Java Using Array

    public static void main(String[] args) {
        int sum  = 0;
        int[] numbers ={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);
        double arrayLength = numbers.length;
        System.out.println("Array length: " + arrayLength);
        double average = sum / arrayLength;
        System.out.println("Average: " + average);
    }
}
