package lecture2;

import java.util.Scanner;

public class JavaOOP {
    public static void main(String[] args){

        /*Student sinhVienA = new Student();

        sinhVienA.name = "Lưu Đình Việt Ân";

        String name = sinhVienA.getName();

        System.out.println(name);*/
        Scanner scanner = new Scanner(System.in);

        Student[] studentArray = new Student[2];
        studentArray[0] =
                new Student("NguyenVanA", "20101748",
                        "20/11/1992", "male", 3.1f);

        studentArray[1] = new Student("NguyenVanB", "20101899");

        System.out.println("Nhap vao MSSV can tim: ");
        String mssv = scanner.nextLine();

        for(Student st : studentArray){
            if(st.getMssv().equals(mssv)){
                System.out.println(st.toString());
                break;
            }
        }

    }
}
