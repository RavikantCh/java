package arrays;

public class SingleDimensionArrayExample {
    public static void main(String[] args) {

        // Declare and initialize
        int[] numbers = { 1, 2, 3, 4, 5 };

        System.out.println("*************************************************");
        System.out.println("Array length: " + numbers.length);

        System.out.println("Iterating array using for loop ******************");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i);
        }

        System.out.println("Iterating array using for each loop *************");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("Iterating array using for while loop *************");
        int count = 0;
        while (count <= numbers.length) {
            System.out.println(count);
            count++;
        }

    }
}
