package collection.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMisc {
      public static void main(String[] args) {
          List<Integer> al = new LinkedList<>();
          List<Integer> al1 = new LinkedList<>();

          // Adding elements to the LinkedList
          al.add(10);
          al.add(40);
          al.add(20);
          al.add(30);

          System.out.println("LinkedList Elements are: " + al);

          // Adding all lements of list to new LinkedList using addAll
          al1.addAll(al);
          System.out.println("Updated LinkedList Elements: " + al1);
          al1.add(70);

          // Sublist to List
          List<Integer> list = al1.subList(1, 3);
          System.out.println("SubList stored in List: " + list);

          // Compare 2 lists
          boolean boolval = al.equals(al1); // returns true because lists are equal
          System.out.println("Are 2 lists equal: " + boolval);

          // retainAll() method (returns common elements in both lists)
          System.out.println("LinkedList Elements are: " + al1);
          al1.retainAll(al);
          System.out.println("retainAll: " + al1);
          al1.add(70);

          // removeAll() method (finding the missing element)
          al1.removeAll(al);
          System.out.println("removeAll: " + al1);

          // contentEquals() method compares the String with the StringBuffer and returns
          // a boolean value
          boolean isContentEqual = al1.toString().contentEquals(al.toString());
          System.out.println("contentEquals: " + isContentEqual);
      }

}
