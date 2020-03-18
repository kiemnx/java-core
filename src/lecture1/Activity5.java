package lecture1;

import java.util.Scanner;

public class Activity5 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thap phan can chuyen doi: ");
        int n = scanner.nextInt();
        int i = 0;
        int[] du = new int[100];

        while(n > 0)
        {
            du[i] = n % 2;
            n = n / 2;
            i ++;
        }
        System.out.println("So thap phan duoc chuyen doi thanh: ");
        for(int j = i-1; j >= 0; j--)
        {
            System.out.print(du[j]);
        }
    }
}
