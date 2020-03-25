package lecture8.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSort {
    public static void main(String... sortingWithList) {
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Một"));
        teachers.add(new Teacher("Hai"));

        //Ascending
        System.out.println("=============== Sort ascending");
        Collections.sort(teachers, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        //Descending
        System.out.println("=============== Sort descending");
        Collections.reverse(teachers);
    }
}

class Teacher{
    String name;
    Teacher(String name) {
        this.name = name;
    }
}

