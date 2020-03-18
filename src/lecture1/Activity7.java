package lecture1;

import java.util.Scanner;

public class Activity7 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xin moi nhap a: ");
        int a = scanner.nextInt();
        System.out.println("Xin moi nhap b: ");
        int b = scanner.nextInt();
        int i;

        System.out.println("Cac so chia het cho " + a + " la: ");
        for (i = 1; i <= 100; i++)
        {
            if ( i % a == 0)
            {
                System.out.println(i);
            }
        }

        System.out.println("Cac so chia het cho " + b + " la: ");
        for (i = 1; i <= 100; i++)
        {
            if (i % b == 0)
            {
                System.out.println(i);
            }
        }

        System.out.println("Cac so chia het cho " + a + " va " + b + " la: ");
        for (i = 1; i <= 100; i++)
        {
            if (i % a == 0 && i % b == 0)
            {
                System.out.println(i);
            }
        }

    }
}