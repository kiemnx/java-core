package lecture8.sort;

import java.util.*;

public class StringSort {

    public static void main(String args[]) {

        // create list
        List<String> list = new ArrayList<String>();
        // add elements to list
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("PHP");
        list.add("Python");

        // Ascending
        Collections.sort(list);
        System.out.println(list);


        //Descending
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(list);
    }
}
