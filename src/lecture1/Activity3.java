package lecture1;

import java.util.Scanner;

public class Activity3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xin moi nhap vao so can tinh bang cuu chuong: ");
        int number = scanner.nextInt();
        System.out.println("Bang cuu chuong " + number + " la: ");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(number + "x" + i + "=" + number*i);
        }
    }
}
