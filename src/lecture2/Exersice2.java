package lecture2;

import java.util.Scanner;

public class Exersice2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input finbonacci leght: ");
        int finbonacciLeght = scanner.nextInt();
        int i = 1, firstNumber = 0, secondNumber = 1, sum = 0;
        System.out.println("Finbonacci range is: ");
        System.out.println(firstNumber);

        while (i <= finbonacciLeght)
        {
            sum = secondNumber + firstNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
            i++;

            System.out.println(sum);

        }
    }
}
