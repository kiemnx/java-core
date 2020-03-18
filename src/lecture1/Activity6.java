package lecture1;

import java.util.Scanner;

public class Activity6 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Xin moi nhap n: ");
        int n = input.nextInt();
        int nn = n*11;
        int nnn = n*111;
        System.out.println("Tong cua ba so " + n + "," + nn + "," + nnn + " la: " +(n + nn + nnn));
    }
}
