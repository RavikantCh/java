package collection.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortExample {
    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Kiwi");
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Grapes");

        System.out.println("Before sort: " + fruitsList);
        Collections.sort(fruitsList);
        System.out.println("After sort -  ascending order: " + fruitsList);
        Collections.sort(fruitsList, Collections.reverseOrder());
        System.out.println("After sort -  descending order: " + fruitsList);
        Collections.sort(fruitsList);
        fruitsList.sort(Collections.reverseOrder());
        System.out.println("After sort -  descending order: " + fruitsList);

        Collections.shuffle(fruitsList); // shuffling the list
        System.out.println("Iteraing a list in reverse order");
        for (int i = fruitsList.size() - 1; i >= 0; i--) {
            String each = fruitsList.get(i); // unboxing
            System.out.print(each + " "); // 5 4 3 2 1
        }
    }
}
