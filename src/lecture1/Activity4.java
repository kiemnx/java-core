package lecture1;

import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap vao so hang: ");
        int soHang = scanner.nextInt();
        System.out.println("Moi nhap vao so ky tu: " );
        int soKyTu = scanner.nextInt();
        int soSao = 1;
        System.out.println("Tam giac cua ban la: ");

        for (int i = 1; i <= soHang; i++)
        {
            int soKyTuTrang = (soKyTu - soSao) / 2;
            for (int j = 1; j <= soKyTuTrang; j++ )
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= soSao; j++)
            {
                System.out.print("*");
            }
            for (int j = 1; j <= soKyTuTrang; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
            soSao = soSao +2;
        }
    }
}
