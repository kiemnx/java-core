package lecture2;

import java.util.Scanner;

public class Exersice3 {
    public static void main(String[] args)
    {

        int[] array = new int[10];
        int[] newArray = new int[9];
        for(int i = 0; i< array.length ; i ++){
            newArray[i] = array[i];
        }
        newArray[10] = 10;
    }
}
