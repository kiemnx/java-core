package lecture1;

import java.util.Scanner;

public class Activity2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xin moi nhap hai so a va b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Tong cua hai so la: " +(a + b));
        System.out.println("Hieu cua hai so la: " +(a - b));
        System.out.println("Tich cua hai so la: " +(a * b));
        System.out.println("Thuong cua hai so la: " +(a / b));
        System.out.println("Phan chia lay du cua hai so la: " +(a % b));
    }
}
