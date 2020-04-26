package chuabaibuoi4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Nhap vao so svien: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[n];
        for (int i=0; i<n; i++){
            System.out.println("Nhap vao sinh vien thu " + (i+1) + ":");

            // Nguyen Xuan Kiem,20201748,3.2
            String line = scanner.nextLine();

            String[] items = line.split(",");

            students[i] = new Student(items[0], items[1], Float.valueOf(items[2]));
        }

        Student temp;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(students[i].getGpa() < students[j].getGpa()){
                    temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }


        for(Student student : students){
            System.out.println(student.toString());
        }

        QuanLySinhVien quanLySinhVien = new QuanLySinhVien();

        Student result = quanLySinhVien.timTheoTenSV("kiem", students);
        System.out.println(result.toString());
    }
}
