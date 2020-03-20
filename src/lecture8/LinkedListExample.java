package lecture8;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(7);

        linkedList.add(5);

        System.out.println(linkedList);

        linkedList.remove(1);

        System.out.println(linkedList);

        int x = linkedList.get(1);
        System.out.println(x);

        int last = linkedList.getLast();
        System.out.println(last);
        int first = linkedList.getFirst();
        System.out.println(first);

    }
}
