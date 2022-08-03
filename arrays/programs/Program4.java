package arrays.programs;

// Program to find Smallest Number in Array Java

public class Program4 {
    public static void main(String[] args) {
        int max = 0;

        int[] numbers = { 10, 55, 2, 48, 150 };
        max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("max number: " + max);
    }
}
