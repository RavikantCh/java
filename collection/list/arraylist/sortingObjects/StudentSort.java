package collection.list.arraylist.sortingObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSort {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Gamma", 27));
        students.add(new Student(1, "Alpha", 30));
        students.add(new Student(2, "Beta", 26));
     

        // Sorting the students list by name
        System.out.println("=========== Sorting the students by name=============");
        Collections.sort(students, new StudentNameComparator());
        for(Student student : students){
            System.out.println(student.id + " -- " + student.name + " -- " + student.age);
        }
      
        // Sorting the students list by age
        System.out.println("=========== Sorting the students by age=============");
        Collections.sort(students, new StudentAgeComparator());
        for (Student student : students) {
            System.out.println(student.id + " -- " + student.name + " -- " + student.age);
        }
    }
}
