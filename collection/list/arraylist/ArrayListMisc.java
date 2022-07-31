package collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMisc {

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        List<Integer> al1 = new ArrayList<>();

        // Adding elements to the ArrayList
        al.add(10);
        al.add(40);
        al.add(20);
        al.add(30);

        System.out.println("ArrayList Elements are: " + al);

        // Adding all lements of list to new ArrayList using addAll
        al1.addAll(al);
        System.out.println("Updated ArrayList Elements: " + al1);
        al1.add(70);

        // Sublist to List
        List<Integer> list = al1.subList(1, 3);
        System.out.println("SubList stored in List: " + list);

        // Compare 2 lists
        boolean boolval = al.equals(al1); // returns true because lists are equal
        System.out.println("Are 2 lists equal: " + boolval);

        // retainAll() method (returns common elements in both lists)
        System.out.println("ArrayList Elements are: " + al1);
        al1.retainAll(al);
        System.out.println("retainAll: " + al1);
        al1.add(70);

        // removeAll() method (finding the missing element)
        al1.removeAll(al);
        System.out.println("removeAll: " + al1);

        // contentEquals() method compares the String with the StringBuffer and returns a boolean value
        boolean isContentEqual = al1.toString().contentEquals(al.toString());
        System.out.println("contentEquals: " + isContentEqual);

        

    }
}
