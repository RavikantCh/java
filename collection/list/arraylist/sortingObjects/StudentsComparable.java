package collection.list.arraylist.sortingObjects;

public class StudentsComparable implements Comparable<StudentsComparable>{

    int id;
    String name;
    int age;

    public StudentsComparable(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(StudentsComparable student) {
      //  return this.name.compareTo(student.name);
        return this.age > student.age ? 1 : this.age < student.age ? -1 : 0;
    }


}
