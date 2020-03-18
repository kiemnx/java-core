package lecture2;

import java.util.Scanner;

public class Exersice3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = scanner.nextInt();
        long sum = 0;
        int i = 0;
        float average;

        while(i <= number)
        {
            sum = sum + i;
            i++;
        }
        System.out.println("The sum of 1 to " + number + " is: " + sum);
        average = (float)sum / number;
        System.out.println("The average is: " + average);
    }
}
