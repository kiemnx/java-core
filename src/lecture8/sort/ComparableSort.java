package lecture8.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSort {
    public static void main(String... sortingWithList) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Một"));
        students.add(new Student("Hai"));

        //Ascending
        System.out.println("=============== Sort ascending");
        Collections.sort(students);

        //Descending
        System.out.println("=============== Sort descending");
        Collections.reverse(students);
    }
}

class Student implements Comparable<Student> {
    String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student simpson) {
        return this.name.compareTo(simpson.name);
    }
}

