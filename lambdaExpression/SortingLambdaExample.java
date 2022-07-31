package lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortingLambdaExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(65, 10, 75, 50));
        System.out.println("Before Sorting: " + list);

        // List - sorting - descending order
        Collections.sort(list, (i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
        System.out.println("After Sorting - decsendng order: " + list);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("After Sorting - decsendng order using Comparator.reverseOrder(): " + list);

        // List - sorting - ascending order
        Collections.sort(list, (i1, i2) -> (i1 > i2) ? 1 : (i1 < i2) ? -1 : 0);
        System.out.println("After Sorting - ascending order: " + list);

        Collections.sort(list, Comparator.naturalOrder());
        System.out.println("After Sorting - ascending order using Comparator.naturalOrder(): " + list);
        

        // TreeSet - sorting - descending order
        Set<Integer> set = new TreeSet<>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
        set.add(100);
        set.add(75);
        set.add(85);
        set.add(25);
        System.out.println("After Sorting - descending order - TreeSet: " + set);

        // TreeMap - sorting - descending order
        Map<Integer, String> map = new TreeMap<>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
        map.put(1, "alpha");
        map.put(3, "gamma");
        map.put(2, "beta");
        System.out.println("After Sorting - descending order - TreeMap: " + map);

        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Gamma", 27));
        students.add(new Student(1, "Alpha", 30));
        students.add(new Student(2, "Beta", 26));

        // Object - sorting - ascending order
        Collections.sort(students, (i1, i2) -> (i1.age > i2.age) ? 1 : (i1.age < i2.age) ? -1 : 0);
        System.out.println("Students - sorting - ascending order:");
        for (Student student : students) {
            System.out.println("id: " + student.id + " name: " + student.name + " age: " + student.age);
        }

        // Object - sorting - desscending order
        Collections.sort(students, (i1, i2) -> (i1.age > i2.age) ? -1 : (i1.age < i2.age) ? 1 : 0);
        System.out.println("Students - sorting - desscending order:");
        for (Student student : students) {
            System.out.println("id: " + student.id + " name: " + student.name + " age: " + student.age);
        }


        // Object - sorting string - ascending order
        Collections.sort(students, (i1, i2) -> i1.name.compareTo(i2.name));
        System.out.println("Students - sorting - ascending order:");
        for (Student student : students) {
            System.out.println("id: " + student.id + " name: " + student.name + " age: " + student.age);
        }

        // Object - sorting string- desscending order
        Collections.sort(students, (i1, i2) -> i2.name.compareTo(i1.name));
        System.out.println("Students - sorting - desscending order:");
        for (Student student : students) {
            System.out.println("id: " + student.id + " name: " + student.name + " age: " + student.age);
        }


    }
}
