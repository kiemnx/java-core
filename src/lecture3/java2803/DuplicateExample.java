package lecture3.java2803;

import java.util.ArrayList;
import java.util.List;

public class DuplicateExample {
    public static void main(String[] args) {
        int [] a = {20, 20, 30, 40, 50, 50, 50};


        String s = "Hello";
        char[] sChar = {'H', 'e', 'l', 'l', 'o'};

        sChar = s.toCharArray();

        int[] result = new int[a.length];

        int index = 0;

        for(int i=0; i< a.length; i++){
            boolean duplicate = false;

            for(int j=0; j<result.length; j++){
                if(result[j] == a[i]){
                    duplicate = true;
                    continue;
                }
            }

            if(!duplicate){
                result[index] = a[i];
                index ++;
            }
        }

        for(int i=0; i<index; i++){
            System.out.print(result[i]+ ",");
        }
        System.out.println("Length: " + (index));

    }
}
