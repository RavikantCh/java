package collection.list.arraylist.sortingObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortComparableMain {
    public static void main(String[] args) {
        List<StudentsComparable> students = new ArrayList<>();
        students.add(new StudentsComparable(3, "Gamma", 27));
        students.add(new StudentsComparable(1, "Alpha", 30));
        students.add(new StudentsComparable(2, "Beta", 26));
     

        // Sorting the students list by name
        Collections.sort(students);
        System.out.println("=========== Sorting the students by name=============");
        for(StudentsComparable student : students){
            System.out.println(student.id + " -- " + student.name + " -- " + student.age);
        }
      
    }
}
