package lecture6;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        System.out.println("1. Them moi can bo;");
        System.out.println("2. Tim kiem ho ten;");
        System.out.println("3. Hien thi danh sach;");

        Scanner sc = new Scanner(System.in);
        int i;
        do {
            System.out.print("Lua chon hanh dong 1-3: ");
            while (!sc.hasNextInt()) {
                System.out.print("Sai cu phap. Vui long thu lai: ");
                sc.next();
            }
            i = sc.nextInt();
        } while (i < 1 || i > 3);

        QLCB qlcb = new QLCB();

        CanBo[] congNhanArray = new CanBo[1];
        switch (i) {
            case 1:
                i = 1;
                System.out.println("1. Cong nhan");
                System.out.println("2. Ky su");
                System.out.println("3. Nhan vien");
                System.out.print("Chon loai can bo muon them: ");
                int loai = sc.nextInt();

                System.out.print("Nhap so can bo muon them thong tin: ");
                int n = sc.nextInt();
                if (loai == 1) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("Nhap cong nhan thu " + (j + 1));
                        sc.nextLine();
                        String line = sc.nextLine();
                        String[] item = line.split(",");

                        CanBo cb = qlcb.themMoiCanBo(item[0], Integer.valueOf(item[1]), item[2], item[3]);
                        congNhanArray[j] = cb;
                        System.out.println("Da them " + congNhanArray[j].toString());
                        break;
                    }
                }
        }

        CanBo cb = qlcb.timKiemTheoHoTen("Nguyen Van A", congNhanArray);
        if(cb == null){
            System.out.println("Khong tim thay can bo");
        } else {
            System.out.println("Tim thay can bo co ten la " + cb.getHoTen());
        }

        qlcb.hienThiDanhsachCacCanBo(congNhanArray);
    }
}
